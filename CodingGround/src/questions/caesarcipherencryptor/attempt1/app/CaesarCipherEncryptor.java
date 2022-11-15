package questions.caesarcipherencryptor.attempt1.app;

class Solution {
  public static String caesarCypherEncryptor(String str, int key) {
    // Write your code here.
    char[] c = str.toCharArray();

    for(int i=0 ; i<c.length ; i++) {
      int temp = (c[i] - 97 + key) % 26 + 97;
      c[i] = (char) temp;
    }

    return String.valueOf(c);
  }
}

public class CaesarCipherEncryptor {
  public static void main(String[] args) {
    String s = "xyz";
    System.out.println(Solution.caesarCypherEncryptor(s, 1));
  }
}
