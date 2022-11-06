package com.questions.tournamentwinner.attempt1.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

class Solution {

  public static String tournamentWinner(
    ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    // Write your code here.

    HashMap<String, Integer> teams = new HashMap<>();

    for(int i=0 ; i<competitions.size() ; i++) {
      if(results.get(i)==1) {
        if(teams.computeIfPresent(competitions.get(i).get(0), (team,score) -> score+3)==null) {
          teams.put(competitions.get(i).get(0), 3);
        }
      } else {
        if(teams.computeIfPresent(competitions.get(i).get(1), (team,score) -> score+3)==null) {
          teams.put(competitions.get(i).get(1), 3);
        }
      }
    }
    
    

    // return teams.entrySet().stream()
    //   .collect(Collectors.maxBy((a,b)->Integer.compare(a.getValue(), b.getValue())))
    //   .get()
    //   .getKey();

    return teams.entrySet().stream()
      .max((home,away) -> Integer.compare(home.getValue(), away.getValue()))
      .get()
      .getKey();
  }
}

public class TornamentWinner {
  public static void main(String[] args) {
    ArrayList<ArrayList<String>> testTeams = new ArrayList<>();
    testTeams.add(new ArrayList<>(Arrays.asList("HTML","C#")));
    testTeams.add(new ArrayList<>(Arrays.asList("C#","Python")));
    testTeams.add(new ArrayList<>(Arrays.asList("Python","HTML")));

    ArrayList<Integer> testRounds = new ArrayList<>(Arrays.asList(0,0,1));

    System.out.println(Solution.tournamentWinner(testTeams, testRounds));
  }
}
