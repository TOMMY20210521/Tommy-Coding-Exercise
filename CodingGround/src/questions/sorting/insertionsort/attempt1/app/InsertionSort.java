package questions.sorting.insertionsort.attempt1.app;

import java.util.Arrays;

class Solution {
  private Solution(){}

  public static int[] insertionSort(int[] array) {
    // Write your code here.

    for(int i=1 ; i<array.length ; i++) {
      for(int j=i ; j>0 ; j--) {
        if(array[j]>array[j-1]) break;
        int temp = array[j];
        array[j] = array[j-1];
        array[j-1] = temp;
      }
    }

    return array;
  }
}

public class InsertionSort {
  public static void main(String[] args) {
    int[] testcase = {1,4,5,773,7,58,84,8};

    Arrays.toString(Solution.insertionSort(testcase));
  }
}
