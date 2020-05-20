//https://leetcode.com/problems/longest-common-prefix/
//        Write a function to find the longest common prefix string amongst an array of strings.
//
//        If there is no common prefix, return an empty string "".
//
//        Example 1:
//
//        Input: ["flower","flow","flight"]
//        Output: "fl"
//        Example 2:
//
//        Input: ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.
//        Note:
//
//        All given inputs are in lowercase letters a-z.

package com.company.LeetcodeProblems;

public class LongestCommonPrefix_14
{
    public String longestCommonPrefix(String[] strs)
    {
        int i = 0;
        int flag = 0;
        String str = "";
        if(strs.length==0)
            return str;
        int len = strs[0].length(); String st = strs[0];int index=0;
        for (int j = 1; j <strs.length ; j++)
        {
            if(strs[j].length()<len)
            {
                st=strs[j];
                len = st.length();
                index=j;
            }
        }
        String temp= strs[index];
        strs[index]  = strs[0];
        strs[0]=temp;


        while (i < strs[0].length()) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                char c = strs[j].charAt(i);
                if (c != ch) {
                    flag = -1;
                    break;
                }
            }
            if (flag == -1)
                return str;
            else {
                str = str + ch;
                i++;
            }
        }
        return str;
    }
}
