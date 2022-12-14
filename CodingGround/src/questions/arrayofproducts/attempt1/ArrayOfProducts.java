package questions.arrayofproducts.attempt1;

import java.util.Arrays;

class Solution {

  public static int[] arrayOfProducts(int[] array) {

    if(array.length == 1) return new int[] {1};

    int[] leftArray = new int[array.length-1];
    int[] rightArray = new int[array.length-1];

    leftArray[0] = array[0];
    rightArray[0] = array[array.length-1];

    for(int i=1 ; i<array.length-1 ; i++) {
      leftArray[i] = array[i] * leftArray[i-1];
      rightArray[i] = array[array.length-1-i] * rightArray[i-1];
    }

    array[0] = rightArray[rightArray.length-1];
    array[array.length-1] = leftArray[leftArray.length-1];

    for(int i=1 ; i<array.length-1 ; i++) {
      array[i] = leftArray[i-1] * rightArray[rightArray.length-1-i];
    }

    return array;
  }

}

public class ArrayOfProducts {
  public static void main(String[] args) {
    int[] testcase = {5};

    System.out.println(Arrays.toString(Solution.arrayOfProducts(testcase)));

  }
}
