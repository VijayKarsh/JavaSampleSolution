package com.techment.practice;

public class PairOfSum {

   
    public static void findPair(int[] nums, int target)
    {
        
        for (int i = 0; i < nums.length - 1; i++)
        {
            
            for (int j = 0; j < nums.length; j++)
            {
               
                if (nums[i] + nums[j] == target)
                {
                    System.out.println("Pair found (" + nums[i] + "," + nums[j] + ")");
            
                }
            }
        }
 
       
        System.out.println("Pair not found");
    }
 
    public static void main (String[] args)
    {
        int[] nums = { 1,2,3,4,5,6,7,8 };
        int target = 5;
 
        findPair(nums, target);
    }
}