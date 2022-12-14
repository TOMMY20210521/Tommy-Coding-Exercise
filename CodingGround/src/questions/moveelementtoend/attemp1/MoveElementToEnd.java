package questions.moveelementtoend.attemp1;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    int arraySize = array.size();

    if(arraySize <= 1) return array;

    int backIndex = arraySize - 1;
    int frontIndex = 0;

    while(frontIndex < backIndex) {

      if(array.get(frontIndex).intValue() == toMove) {
        Integer temp = array.remove(frontIndex);
        array.add(temp);
        backIndex--;
        frontIndex--;
      }

      frontIndex++;
    }
    
    return array;
  }
}

public class MoveElementToEnd {
  public static void main(String[] args) {
    
    List<Integer> testcase = new ArrayList<>(List.of(2,3,4,1,5,6,7));

    System.out.println(Solution.moveElementToEnd(testcase, 2).toString());

  }
}
