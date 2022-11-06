package questions.lengthoflastword.app;

class Solution {
  public int lengthOfLastWord(String s) {
    // Attempt 1
    // return (s.split(" "))[s.split(" ").length-1].length();

    // Attempt 2
    // if(s==null) return 0;

    // for(int i=s.length()-1 ; i>=0 ; i--) {
    //   if(s.charAt(i)==' ') return s.length()-i-1;
    // }

    // return s.length();

    // Attemp 3

    return s==null ? 0 : s.length()-s.lastIndexOf(" ")-1;
  }
}

public class LengthOfLastWord {
  public static void main(String[] args) {
    String[] testCase = {"Hello You","","123","aefa ogiheg oeaijfaf"};

    for(String s: testCase) {
      System.out.println((new Solution()).lengthOfLastWord(s));
    }
    
  }
}
