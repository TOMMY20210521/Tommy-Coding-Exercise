package questions.firstduplicatevalue.attempt1;

import java.lang.reflect.Array;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Solution {
  

  public static int firstDuplicateValue(int[] array) {

    if(array.length<=1) return -1;

    Set<int[]> s = Arrays.asList(array).stream().collect(Collectors.toSet());

    s.forEach(e-> System.out.println(Arrays.toString(e)));

    for(int i=1 ; i<array.length ; i++) {
      
    }

    return -1;
  }

}

public class FirstDuplicateValue {
  public static void main(String[] args) {

    int[] testcase = {1,2,3,4,5,6,7};

    Solution.firstDuplicateValue(testcase);
  }
}
