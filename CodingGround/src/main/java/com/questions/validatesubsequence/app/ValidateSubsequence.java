package com.questions.validatesubsequence.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
    int sequenceLength = sequence.size();

    array.sort((a,b) -> Integer.compare(a, b));
    sequence.sort((a, b) -> Integer.compare(a, b));

    int pointer = 0;

    for (int i = 0; i < array.size(); i++) {
      if (sequence.get(pointer).equals(array.get(i)))
        pointer++;
      if (pointer == sequenceLength)
        return true;
    }

    return false;
  }
}

public class ValidateSubsequence {
  public static void main(String[] args) {
    List<Integer> test1 = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
    List<Integer> test2 = new ArrayList<>(Arrays.asList(1, 6, -1, 10));

    System.out.println(Program.isValidSubsequence(test1, test2));
  }
}
