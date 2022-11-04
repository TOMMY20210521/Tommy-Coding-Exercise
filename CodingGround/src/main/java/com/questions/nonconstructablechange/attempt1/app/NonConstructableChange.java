package com.questions.nonconstructablechange.attempt1.app;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.LockSupport;


class Solution {
  public static int nonConstructableChange(int[] coins) {
    if(coins.length==0) return 1;

    int result = 1;
    List<Integer> coinList = Arrays.stream(coins).boxed().sorted().toList();

    while(true) {
      if(!coinList.contains(result) && !canBeComputed(result,coinList)) {
        break;
      }
      result++;
    }

    return -1;
  }

  public static boolean canBeComputed(int toCheck, List<Integer> coinList) {
    
    List<Integer> availableList = coinList.stream().filter((x) -> Integer.compare(x, toCheck) == -1).toList();

    for(int i=0 ; i<coinList.size() ; i++) {
      if(coinList.get(i)>toCheck) return false;
      // for(int j=)
    }

    return false;
  }
}

public class NonConstructableChange {
  public static void main(String[] args) {
    System.out.println((new int[] {}).length);
  }
}
