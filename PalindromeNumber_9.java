package com.company.LeetcodeSubmitted;
//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//
//        Example 1:
//
//        Input: 121
//        Output: true
//        Example 2:
//
//        Input: -121
//        Output: false
//        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//        Example 3:
//
//        Input: 10
//        Output: false
//        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
public class PalindromeNumber_9
{
    public boolean isPalindrome(int x)
    {
        int num = x;
        int sum = 0;

        if (num < 0) {
            return false;
        }

        while (num > 0) {
            int r = num % 10;
            sum = sum * 10 + r;
            num = num / 10;
        }
        if(sum==x)
            return true;

        return false;

    }
}
