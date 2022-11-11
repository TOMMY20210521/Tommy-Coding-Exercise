package questions.palindromecheck.attempt1.app;

class Solution {
  public static boolean palindromeCheck(String str) {
    char[] temp = str.toCharArray();
    for(int i=0 ; i<temp.length/2 ; i++) {
      if(temp[i]!=temp[temp.length-i-1]) return false;
    }
    return true;
  }
}

public class PalindromeCheck {
  public static void main(String[] args) {
    
  }
}
