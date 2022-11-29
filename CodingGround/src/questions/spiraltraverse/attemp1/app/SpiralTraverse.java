package questions.spiraltraverse.attemp1.app;

import java.lang.ProcessBuilder.Redirect;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution
 */
class Solution {

  public static List<Integer> spiralTraverse(int[][] array) {
    // Write your code here.
    List<Integer> result = new ArrayList<>(array.length * array[0].length);

    // 0 -> right
    // 1 -> down
    // 2 -> left
    // 3 -> up
    int endDirection;
    int min = Math.min(array.length, array[0].length);
    int endLayer = (int) (min / 2) + (min % 2) - 1;

    if(array[0].length >= array.length) {
      endDirection = (array.length%2 == 0) ? 2 : 0;
    } else {
      endDirection = (array[0].length%2 == 0) ? 3 : 1;
    }

    int direction = 0;
    int layer = 0;
    int x = -1;
    int y = 0;

    do {
      switch(direction) {
        case 0:
          if(x==array[0].length-1-layer) {
            direction = (direction + 1) % 4;
            y++;
          } else x++;
          break;

        case 1:
          if(y==array.length-1-layer) {
            direction = (direction + 1) % 4;
            x--;
          } else y++;
          break;

        case 2:
          if(x==layer) {
            direction = (direction + 1) % 4;
            y--;
          } else x--;
          break;
        
        case 3:
          if(y==layer+1) {
            direction = (direction + 1) % 4;
            layer++;
            x++;
          } else {
            y--;
          }
          break;
        
        default:
          throw new IllegalArgumentException();
      }
      result.add(array[y][x]);
    } while(!theEnd(array[0].length, array.length, x, y, layer, endLayer, direction, endDirection));

    return result;
  }

  static boolean theEnd(int xDy, int yDy, int xLo, int yLo, int layer, int endLayer, int direction, int endDirection) {

    if(direction!=endDirection || layer!=endLayer) return false;


    switch (endDirection) {
      case(0):
        if(xLo == xDy-1-layer)
          return true;
        break;
      case(1):
        if(yLo == yDy-1-layer)
          return true;
        break;
      case(2):
        if(xLo == layer)
          return true;
        break;
      case(3):
        if(yLo == layer+1)
          return true;
        break;
      default:
        throw new IllegalArgumentException();
    };

    return false;
  }

}

public class SpiralTraverse {
  public static void main(String[] args) {
    int[][] array = {
      {27, 12, 35, 26},
      {25, 21, 94, 11},
      {19, 96, 43, 56},
      {55, 36, 10, 18},
      {96, 83, 31, 94},
      {93, 11, 90, 16}
    };

    System.out.println(Solution.spiralTraverse(array).toString());

  }
}
