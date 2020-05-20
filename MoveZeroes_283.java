//https://leetcode.com/problems/move-zeroes/
package com.company.LeetcodeSubmitted;
//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        Example:
//
//        Input: [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Note:
//
//        You must do this in-place without making a copy of the array.
//        Minimize the total number of operations.
public class MoveZeroes_283
{
    public void moveZeroes(int[] nums)
    {
        for (int i = 0; i <nums.length ; i++)
        {
            for (int j = 0; j <nums.length-i-1; j++) {

                if(nums[j]==0)
                {
                    nums[j] =nums[j+1];
                    nums[j+1] = 0;
                }
            }
        }

    }
}
