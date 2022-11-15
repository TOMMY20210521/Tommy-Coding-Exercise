package questions.findthreelargestnumbers.attempt1.app;

import java.util.*;

class Solution {
  public static int[] findThreeLargestNumbers(int[] array) {
    // Write your code here.
    if(array.length==3) {
      Arrays.sort(array);
      return array;
    }
    int[] result = new int[3];
    result[0] = array[0];
    result[1] = array[1];
    result[2] = array[2];
    Arrays.sort(result);
    for(int i=3 ; i<array.length ; i++) {
      System.out.println(Arrays.toString(result));
      for(int j=0 ; j<3 ; j++) {
        if(j==0 && array[i]<result[j]) break;
        if(j==2 || array[i]<result[j+1]) {
          for(int k=0 ; k<j ; k++) {
            result[k] = result[k+1];
          }
          result[j] = array[i];
          break;
        }
      }
    }
    return result;
  }
}

public class FindThreeLargestNumbers {
  public static void main(String[] args) {
    int[] test = {55, 7, 8, 3, 43, 11};
    Solution.findThreeLargestNumbers(test);
  }
}
