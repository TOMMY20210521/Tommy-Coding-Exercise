package com.TommyCodingExercise.app;

import java.util.LinkedList;
import java.util.List;

public class CodingPractice {
  public static void main(String[] args) {
    // Declaration & Initialization
    LinkedList<String> strings = new LinkedList<>();

    // Adding elements
    strings.add("I");
    strings.add("C");
    strings.add("E");
    strings.add("N");
    strings.addLast("T");
    strings.addFirst("V");
    strings.add(2,"N");
    System.out.println(strings);

    // Removing elements
    strings.remove("E");
    strings.remove(4);
    strings.removeFirst();
    strings.removeLast();
    System.out.println(strings);

    // Set elements
    strings.set(2, "F");
    System.out.println(strings);

    // Access by index
    System.out.println(strings.get(1));

    // Access by loop
    for(String str : strings) {
      System.out.println(str + " ");
    }
  }
}
