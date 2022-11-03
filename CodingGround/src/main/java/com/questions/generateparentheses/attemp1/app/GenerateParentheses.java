package com.questions.generateparentheses.attemp1.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Pattern;

class Solution {

  static String randomSet(int n) {
    int left = 0;
    int right = 0;
    StringBuilder randString = new StringBuilder("");
    
    // Generate random combination
    while(left!=n && right!=n) {
      int r = (new Random()).nextInt(100)%2;
      if(r == 1) {
        randString.append("(");
        left++;
      } else {
        randString.append(")");
        right++;
      }
    }

    // Fill up the rest when one side reach the limit
    if (right != n) {
      for (int i = right; i < n; i++) {
        randString.append(")");
      }
    }
    if (left != n) {
      for (int i = left; i < n; i++) {
        randString.append("(");
      }
    }
    
    return randString.toString();
  }


  public List<String> generateParenthesis(int n) {
    Set<String> tempSet = new HashSet<>();

    while(tempSet.size()<(Math.pow(2, n))) {
      String s = randomSet(n);
      // System.out.println(s);
      tempSet.add(s);
    }

    Predicate<String> checkValid = s -> {
      try {
        Pattern.compile(s);
        return true;
      } catch (Exception e) {
        return false;
      }
    };

    return tempSet.stream()
        .filter(checkValid)
        .toList();
  }
}

public class GenerateParentheses {
  public static void main(String[] args) {
    int[] inputs = {20};//{1,2,3,4,5,6,7};
    for(int i: inputs) {
      System.out.println((new Solution()).generateParenthesis(i));
    }
    
    // System.out.println(Solution.randomSet(2));
  }
}
