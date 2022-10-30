package com.tommycodingexercise.app;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

class Solution {
  public static boolean containsDuplicate(int[] nums) {
    if(nums.length<=1) return false;
    Arrays.sort(nums);
    int checker = nums[0];
    for(int i=1 ; i<nums.length ; i++) {
      if(nums[i]==checker) return true;
      checker = nums[i];
    }

    return false;
  }
}

public class ContainsDuplicate {
  public static void main(String[] args) {
    int[] test1 = {1,2,3,5,5,3,4};


    System.out.println(Solution.containsDuplicate(test1));
  }
}
