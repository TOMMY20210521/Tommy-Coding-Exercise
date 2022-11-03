package com.questions.plusone.app;

import java.util.Arrays;

class Solution {
  public int[] plusOne(int[] digits) {
    // int increment = 1;

    // for (int i = digits.length - 1; i >= 0; i--) {
    //   digits[i] += increment--;
    //   if (digits[i] == 10) {
    //     digits[i] = 0;
    //     increment = 1;
    //   }
    //   if (increment == 0)
    //     return digits;
    // }

    // digits = new int[digits.length+1];
    // digits[0] = 1;

    // // int[] result = new int[digits.length + 1];
    // // result[0] = increment;
    // // for (int i = 1; i < result.length; i++) {
    // //   result[i] = digits[i - 1];
    // // }

    // return digits;

    digits[digits.length - 1] = digits[digits.length - 1] + 1;
    for (int i = digits.length - 1; i > 0; i--) {
      if (digits[i] > 9) {
        digits[i] = 0;
        digits[i - 1] = digits[i - 1] + 1;
      }
    }

    if (digits[0] == 10) {
      int[] a = new int[digits.length + 1];
      a[0] = 1;
      a[1] = 0;
      for (int j = 1; j < digits.length; j++) {
        a[j + 1] = digits[j];
      }
      return a;

    }
    return digits;
  }
}

public class PlusOne {
  public static void main(String[] args) {
    int[][] testCase ={{1,2,3,4,5},{9,9,9}};

    for(int[] i: testCase) {
      System.out.println(Arrays.toString((new Solution()).plusOne(i)));
    }
  }
}
