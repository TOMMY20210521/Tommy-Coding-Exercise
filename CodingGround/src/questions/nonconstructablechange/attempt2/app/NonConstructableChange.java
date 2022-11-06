package com.questions.nonconstructablechange.attempt2.app;

import java.util.Arrays;

class Solution {
  public static int nonConstructableChange(int[] coins) {
    Arrays.sort(coins);

    int sum = 0;

    for(int i=0 ; i<coins.length ; i++) {
      if(coins[i]>sum+1) return sum + 1;
      sum += coins[i];
    }

    return sum+1;
  }
}

public class NonConstructableChange {
  public static void main(String[] args) {
    int[] testCase = {1,2,3};

    System.out.println(Solution.nonConstructableChange(testCase));
  }
}
