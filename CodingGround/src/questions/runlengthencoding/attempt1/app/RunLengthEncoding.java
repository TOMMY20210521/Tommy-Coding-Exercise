package questions.runlengthencoding.attempt1.app;

class Solution {
  public static String runLengthEncoding(String string) {
    if(string.length()==1) return "1"+string;

    String result = "";
    char[] s = string.toCharArray();
    char charPointer = string.charAt(0);
    int count = 1;

    for(int i=1 ; i<s.length ; i++) {
      if(s[i]!=charPointer || count==9) {
        result = result + count + charPointer;
        count = 0;
        charPointer = s[i];
      }
      count++;
    }

    return result+count+charPointer;
  }
}

public class RunLengthEncoding {
  public static void main(String[] args) {
    
  }
}
