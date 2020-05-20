package com.company.LeetcodeSubmitted;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        Example:
//
//        Given nums = [2, 7, 11, 15], target = 9,
//
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].
public class TwoSum_1
{
    public int[] twoSum(int[] nums, int target)
    {
        int i=0;
        int[] ar = new int[2];
        while(i<nums.length)
        {
            int tgt = target-nums[i];
            int index = search(nums, tgt, i);
            if(index!=-1)
            {
                ar[0] = i;
                ar[1] = index;
                return ar;
            }
            i++;
        }
        return ar;
    }

    private  int search(int[] nums, int tgt, int m)
    {
        for (int i = 0; i <nums.length ; i++)
        {
            if(nums[i] == tgt && i!=m)
                return i;
        }
        return -1;
    }
}

