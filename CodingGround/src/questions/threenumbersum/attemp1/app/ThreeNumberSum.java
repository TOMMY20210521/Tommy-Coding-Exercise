package questions.threenumbersum.attemp1.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    // Write your code here.

    List<Integer[]> result = new ArrayList<>();

    if(array.length < 3) return result;

    Arrays.sort(array);

    for(int i=0 ; i<array.length-2 ; i++) {
      int leftPointer = i + 1;
      int rightPointer = array.length - 1;
      while(leftPointer < rightPointer) {
        if(array[i] + array[leftPointer] + array[rightPointer] == targetSum) {
          result.add(new Integer[] {array[i], array[leftPointer], array[rightPointer]});
        }

        if(array[i] + array[leftPointer] + array[rightPointer] > targetSum) {
          rightPointer--;
        } else {
          leftPointer++;
        }
      }
    }
    
    return result;
  }

  public static void print(List<Integer[]> arr) {
    for (int i = 0; i < arr.size(); i++) {
      System.out.print("[");
      for(int j = 0; j < 3 ; j++) {
        if(j==2) {
          System.out.print(arr.get(i)[j]);
        } else {
          System.out.print(arr.get(i)[j] + ",");
        }
      }
      System.out.print("]");
    }
  }

}

public class ThreeNumberSum {
  public static void main(String[] args) {
    int[] testCase = {12, 3, 1, 2, -6, 5, -8, 6};

    Solution.print(Solution.threeNumberSum(testCase, 0));

  }
}
