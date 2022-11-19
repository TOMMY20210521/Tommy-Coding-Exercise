package testground.algoclass.day1;

public class Day1 {
  public static void main(String[] args) {
    int[] arr = new int[10];

    int toCheck = 1;

    int location = -1;

    for(int i=0 ; i<arr.length ; i++) {
      if(arr[i] == toCheck) {
        location = i;
        break;
      }
    }

    
  }
}
