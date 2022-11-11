package questions.tandembicycle.attempt1.app;

import java.util.Arrays;

class Solution {
  public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
    int sum = 0;
    Arrays.sort(redShirtSpeeds);
    Arrays.sort(blueShirtSpeeds);
    if(fastest) {
      for(int i=0 ; i<redShirtSpeeds.length ; i++) {
        sum += (redShirtSpeeds[i]>blueShirtSpeeds[blueShirtSpeeds.length-i-1])? redShirtSpeeds[i] : blueShirtSpeeds[blueShirtSpeeds.length-i-1];
      }
    } else {
      for(int i=0 ; i<redShirtSpeeds.length ; i++) {
        sum += (redShirtSpeeds[i]>blueShirtSpeeds[i])? redShirtSpeeds[i] : blueShirtSpeeds[i];
      }
    }
    return sum;
  }
}

public class TandemBicycle {
  public static void main(String[] args) {
    
  }
}
