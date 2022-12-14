package questions.longestpeak.attempt1;

class Solution {

  public static int longestPeak(int[] array) {

    if(array.length < 3) return 0;

    int peakCount = 0;
    int maxPeak = 0;
    boolean rising = false;
    boolean falling = false;

    for(int i=1 ; i<array.length ; i++) {

      if(array[i] == array[i-1]) {
        if(rising==true && falling==true && ++peakCount > maxPeak) maxPeak = peakCount;
        rising = false;
        falling = false;
        peakCount = 0;
      } else if(array[i] > array[i-1]) {
        if(falling==true) {
          falling = false;
          peakCount++;
          if(peakCount > maxPeak) maxPeak = peakCount;
          peakCount = 0;
        }
        rising = true;
        peakCount++;
      } else {
        if(rising==false) continue;
        falling = true;
        peakCount++;
        if(i==array.length-1 && ++peakCount>maxPeak) maxPeak = peakCount;
      }
    }

    return maxPeak;
  }

}

public class LongestPeak {
  
  public static void main(String[] args) {

    int[] testcase = {1,1,3,2,1};

    System.out.println(Solution.longestPeak(testcase));

  }

}
