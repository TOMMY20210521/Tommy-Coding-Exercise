package questions.firstnonrepeatingcharacter.attempt1.app;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public static int firstNonRepeatingCharacter (String string) {
    if(string.length()<=1) return 0;
    Set<Character> set = new HashSet<>();

    for(int i=0 ; i<string.length() ; i++) {
      if(set.add(string.charAt(i)) && string.indexOf(string.charAt(i), i+1)==-1) return i;
      System.out.println(set.toString());
    }
    
    return -1;
  }
}

public class FirstNonRepeatingCharacter {
  public static void main(String[] args) {
    String test = "faadabcbbebdf";

    System.out.println(Solution.firstNonRepeatingCharacter(test));
  }
}
