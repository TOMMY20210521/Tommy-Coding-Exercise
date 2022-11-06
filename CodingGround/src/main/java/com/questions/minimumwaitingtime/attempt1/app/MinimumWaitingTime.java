package com.questions.minimumwaitingtime.attempt1.app;

import java.util.Arrays;

class Solution {
  public static int minimumWaitingTime(int[] queries) {
    int sum = 0;
    Arrays.sort(queries);

    for(int i=0 ; i<queries.length-1 ; i++) {
      sum = 2*sum + queries[i];
    }

    return sum;
  }
}

public class MinimumWaitingTime {
  public static void main(String[] args) {
    int[] testcase = {4,1,5,4,6,8,2,4,6};
    System.out.println(Solution.minimumWaitingTime(testcase));
  }
}