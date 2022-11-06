package questions.generateparentheses.attemp2.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;


class Solution {
  public static List<String> generateParenthesis(int n) {
    List<String> result  = new LinkedList<>();  
    
    looping('(', n-1, n, "", result);

    return result;
  }

  public static void looping(char symbol, int openCount, int closeCount, String result, List<String> results) {
    result = result + symbol;

    if(openCount>=0) looping('(', openCount-1, closeCount, result, results);
    if(closeCount>openCount) looping(')', openCount, closeCount-1, result, results);

    if(openCount==0 && closeCount==0) results.add(result);
  }
}

public class GenerateParenthese {
  public static void main(String[] args) {
    System.out.println(Solution.generateParenthesis(10).toString());
  }
}
