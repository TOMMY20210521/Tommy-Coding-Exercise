package questions.productsum.attemp1.app;

import java.util.ArrayList;
import java.util.List;

class Solution {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    // Write your code here.
    
    return productSum(array, 1);
  }

  public static int productSum(List<Object> array, int depth) {
    int sum = 0;
    for(Object o: array) {
      sum += (o instanceof ArrayList) ? productSum((ArrayList<Object>)o,depth+1) : (int)o;
    }
    return depth * sum;
  }
}

public class ProductSum {
  public static void main(String[] args) {
    
  }
}
