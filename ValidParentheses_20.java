package com.company.LeetcodeSubmitted;
//https://leetcode.com/problems/valid-parentheses/
//        Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//        An input string is valid if:
//
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.
//        Note that an empty string is also considered valid.
//
//        Example 1:
//
//        Input: "()"
//        Output: true
//        Example 2:
//
//        Input: "()[]{}"
//        Output: true
//        Example 3:
//
//        Input: "(]"
//        Output: false
//        Example 4:
//
//        Input: "([)]"
//        Output: false
//        Example 5:
//
//        Input: "{[]}"
//        Output: true
public class ValidParentheses_20
{
    public boolean isValid(String s) {
        String str="";
        StringBuilder st = new StringBuilder(str);
        boolean res = bb(s, st);
        return res;
    }
    public boolean bb(String unprocessed, StringBuilder processed) {
        int i = 0;
        int n = unprocessed.length();
        if(n%2!=0)
            return false;
        while (i < n) {
            char ch = unprocessed.charAt(0);
            if (ch == '(' || ch == '{' || ch == '[') {
                processed = processed.append(ch);
            }

            else if (ch == ')') {
                if (processed.lastIndexOf("(") != processed.length()-1 || processed.lastIndexOf("(")==-1)
                    return false;
                else {
                    processed.deleteCharAt(processed.length() - 1);
                }
            }
            else if (ch == '}') {
                if (processed.lastIndexOf("{") != processed.length() - 1 || processed.lastIndexOf("{")==-1)
                    return false;
                else {
                    processed.deleteCharAt(processed.length() - 1);
                }
            }
            else if (ch == ']') {
                if (processed.lastIndexOf("[") != processed.length() - 1 || processed.indexOf("[")==-1)
                    return false;
                else {
                    processed.deleteCharAt(processed.length() - 1);
                }
            }
            unprocessed = unprocessed.substring(1);
            i++;
        }
        if(processed.length()!=0)
            return false;
        return true;
    }
}
