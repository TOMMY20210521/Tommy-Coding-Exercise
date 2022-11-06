package questions.generatedocument.attempt1.app;

import java.util.Arrays;

class Solution {
  public static boolean generateDocument(String characters, String document) {
    char[] c = characters.toCharArray();
    char[] d = document.toCharArray();

    if(d.length==0) return true;
    
    Arrays.sort(c);
    Arrays.sort(d);

    int pointer = 0;

    for(int i=0 ; i<c.length ; i++) {
      if(c[i]==d[pointer]) pointer++;
      if(pointer==d.length) return true;
    }

    return false;
  }
}

public class GenerateDocument {
  public static void main(String[] args) {
    String a = "\"Bste!hetsi ogEAxpelrt x \"";
    String b = "";

    System.out.println(Solution.generateDocument(a, b));
  }
}
