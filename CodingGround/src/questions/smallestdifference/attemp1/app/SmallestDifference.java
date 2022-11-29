package questions.smallestdifference.attemp1.app;

import java.util.Arrays;

class Solution {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    // Write your code here.

    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);
    
    System.out.println(Arrays.toString(arrayOne));
    System.out.println(Arrays.toString(arrayTwo));

    int min = Math.abs(arrayOne[0]-arrayTwo[0]);
    int lastDiff = min;

    int[] result = {0, 0};

    int moving = 1; // 1 move 1, -1 move 2
    int p1,p2;
    if(Math.abs(arrayOne[0]-arrayTwo[1])<Math.abs(arrayOne[1]-arrayTwo[0])) {
      p1 = 0;
      p2 = 1;
    } else {
      p1 = 1;
      p2 = 0;
    }

    while(!(p1>arrayOne.length-1 && p2>arrayTwo.length-1)) {
      
      int diff = Math.abs(arrayOne[p1] - arrayTwo[p2]);
      if(diff < min) {
        min = diff;
        result[0] = arrayOne[p1];
        result[1] = arrayTwo[p2];
      }
      
      if(p1==arrayOne.length-1 && p2==arrayTwo.length-1) break;
      if(diff > lastDiff) moving *= -1;

      lastDiff = diff;

      if(p1==arrayOne.length-1) moving = -1;
      if(p2==arrayTwo.length-1) moving = 1;
      if(moving<0) {
        p2++;
      } else {
        p1++;
      }


    }

    return result;
  }
}

public class SmallestDifference {
  public static void main(String[] args) {

    int[] arrayOne = {10, 1000, 9124, 2142, 59, 24, 596, 591, 124, -123};
    int[] arrayTwo = {-1441, -124, -25, 1014, 1500, 660, 410, 245, 530};

    System.out.println(Arrays.toString(Solution.smallestDifference(arrayOne, arrayTwo)));

  }
}
