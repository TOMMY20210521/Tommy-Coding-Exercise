package questions.sortedsquarearray.attempt1.app;

import java.util.Arrays;

class Solution {

  public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
    if (array != null) {
      for (int i = 0; i < array.length; i++) {
        array[i] *= array[i];
      }
      Arrays.sort(array);
      return array;
    }
    return new int[] {};
  }
}

public class SortedSquaredArray {
  public static void main(String[] args) {
    int[] testcase = {-2,1,3,4,6,12};

    System.out.println(Arrays.toString((new Solution()).sortedSquaredArray(testcase)));
  }
}
