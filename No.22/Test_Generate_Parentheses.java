package com.x3.test.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目描述:
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Date: 2020/3/1 12:48
 */
public class Test_Generate_Parentheses {

    /**	main方法测试 */
    public static void main(String[] args) {
        Test_Generate_Parentheses test=new Test_Generate_Parentheses();
        int n1=0;
        int n2=1;
        int n3=3;
        System.out.println(test.generateParenthesis(n3));
    }


    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        if (n>0){
            recursive("",n,n,result);
            return result;
        }
        return result;
    }

    public void recursive(String current,int left,int right,List<String> result){
       if (left==0 && right==0){
           result.add(current);
           return;
       }
       if (left>right){
           return;
       }
       if (left>0){
           recursive(current+"(",left-1,right,result);
       }
       if (right>0){
           recursive(current+")",left,right-1,result);
       }
    }


}
