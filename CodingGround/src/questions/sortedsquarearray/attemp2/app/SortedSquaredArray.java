package questions.sortedsquarearray.attemp2.app;

import java.util.Arrays;

class Solution {

  public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
    return Arrays.stream(array).map(x -> x * x).sorted().toArray();
  }
}

class Solution2 extends Solution {
  public int[] sortedSquaredArray(int[] array) {
  return new int[] {};
  }
}

public class SortedSquaredArray {
  public static void main(String[] args) {
    int[] testcase = { -2, 1, 3, 4, 6, 12 };

    // System.out.println(Arrays.toString(Solution.sortedSquaredArray(testcase)));

    Solution solution = new Solution();
    Solution2 solution2 = (Solution2) new Solution();

    testcase=new int[] {-2,1,3,4,6,12};
    System.out.println(Arrays.toString(solution.sortedSquaredArray(testcase)));
    testcase=new int[] {-2,1,3,4,6,12};
    System.out.println(Arrays.toString(solution2.sortedSquaredArray(testcase)));

    
    // System.out.println(Arrays.toString(Stream.of(testcase).map((x) -> x*x).toArray()));

  }
}
