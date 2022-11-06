package questions.addbinary.attempt2.app;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
  public static String addBinary(String a, String b) {
    if(a.charAt(0)=='0' && b.charAt(0)=='0') return "";
    (new ArrayList<>(Arrays.asList(a.split("")))).stream();
    String result = "";
    String front = addBinary(a.substring(0,a.length()-2), b.substring(0,b.length()-2));
    return front + result;
  }
}

public class AddBinary {
  public static void main(String[] args) {
    String[] a = { "1001", "101", "1111" };
    String[] b = { "1001", "101", "1111" };

    for (String s1 : a) {
      for (String s2 : b) {
        System.out.println(s1 + " + " + s2 + " = " + Solution.addBinary(s1, s2));
      }
    }

  }
}
