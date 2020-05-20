//Given a 32-bit signed integer, reverse digits of an integer.
//
//        Example 1:
//
//        Input: 123
//        Output: 321
//        Example 2:
//
//        Input: -123
//        Output: -321
//        Example 3:
//
//        Input: 120
//        Output: 21
//        Note:
//        Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

package com.company.LeetcodeSubmitted;

public class ReverseInteger_7
{
    public int reverse(int x)
    {
        int sum = 0;
        int m = 1;

        if (x < 0) {
            x = x * -1;
            m = -1;
        }

        while (x > 0) {
            int r = x % 10;

            if (sum > 214748364)
            {
                return 0;
            }
            if(sum == 214748364)
            {
                if(m==-1 && r==9)
                {
                    return 0;
                }
                if(r>7 && m!=-1)
                {
                    return 0;
                }
            }
            sum = sum * 10 + r;
            x = x / 10;
        }
        sum = sum * m;

        return sum;
    }
}
