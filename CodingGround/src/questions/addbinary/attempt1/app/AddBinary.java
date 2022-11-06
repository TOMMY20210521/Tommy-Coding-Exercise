package questions.addbinary.attempt1.app;

class Solution {
  public static String addBinary(String a, String b) {
    String result = "";

    int increment = 0;
    int aLength = a.length();
    int bLength = b.length();
    if (aLength >= bLength) {
      for (int i = 1; i <= aLength; i++) {
        int sum = (a.charAt(aLength - i) == '1') ? 1 + increment : 0 + increment;
        if (i <= bLength && b.charAt(bLength - i) == '1')
          sum++;
  
        increment = (sum > 1) ? 1 : 0;
        result = sum % 2 + result;
      }
    } else {
      for (int i = 1; i <= bLength; i++) {
        int sum = (b.charAt(bLength - i) == '1') ? 1 + increment : 0 + increment;
        if (i <= aLength && a.charAt(aLength - i) == '1')
          sum++;

        increment = (sum > 1) ? 1 : 0;
        result = sum % 2 + result;
      }
    }


    return (increment > 0) ? increment + result : result;
  }
}

public class AddBinary {
  public static void main(String[] args) {
    String[] a = { "1001", "101", "1111" };
    String[] b = { "1001", "101", "1111" };

    for(String s1: a) {
      for(String s2: b) {
        System.out.println(s1 + " + " + s2 + " = " + Solution.addBinary(s1, s2));
      }
    }

  }
}
