package questions.search.binarysearch.attempt1.app;

class Solution {
  public static int binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length-1;
    int pointer;

    do {
      if(array[left]==target) return left;
      if(array[right]==target) return right;
      pointer = (left+right)/2;
      System.out.println(array[left]+" "+array[pointer]+" "+array[right]);
      if(array[pointer]==target) return pointer;
      if(array[pointer]>target) right = pointer - 1;
        else left = pointer + 1;
    }
    while(right-left>=1);
    

    return -1;
  }
}

public class BinarySearch {
  public static void main(String[] args) {
    int[] testcase = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
    int result = Solution.binarySearch(testcase, 72);
    System.out.println(result);
  }
}
