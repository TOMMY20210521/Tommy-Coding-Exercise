package questions.classphoto.attempt1.app;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
  public static boolean classPhoto(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    redShirtHeights.sort((r1,r2)->r1.compareTo(r2));
    blueShirtHeights.sort((b1,b2)->b1.compareTo(b2));

    int direction = redShirtHeights.get(0).compareTo(blueShirtHeights.get(0));
    if(direction==0) return false;

    for(int i=1 ; i<redShirtHeights.size() ; i++) {
      int newDirection = redShirtHeights.get(i).compareTo(blueShirtHeights.get(i));
      System.out.println(direction + " " + newDirection);
      if(direction==0 || newDirection==0 || direction!=newDirection) return false;
      direction = newDirection;
    }

    return true;
  }
}

public class ClassPhoto {
  public static void main(String[] args) {
    ArrayList<Integer> blueRow = new ArrayList<>(Arrays.asList(20, 5, 4, 4, 4, 4, 4, 4));
    ArrayList<Integer> redRow = new ArrayList<>(Arrays.asList(19, 19, 21, 1, 1, 1, 1, 1));

    System.out.println(redRow.stream().sorted().toList().toString());
    System.out.println(blueRow.stream().sorted().toList().toString());

    System.out.println(Solution.classPhoto(blueRow, redRow));
  }
}
