package com.questions.anagrams.app;

public class Anagrams {

  static char[] sort(char[] a) {
    if (a.length <= 1)
      return a;

    for (int i = 1; i < a.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (a[j] < a[j+1]) break;
        char temp = a[j+1];
        a[j+1] = a[j];
        a[j] = temp;
      }
    }

    return a;
  }

  static boolean isAnagram(String a, String b) {
    // Complete the function
    if (a.length() != b.length())
      return false;
    char[] a1 = sort(a.toLowerCase().toCharArray());
    char[] b1 = sort(b.toLowerCase().toCharArray());

    System.out.println(a1);
    System.out.println(b1);

    return String.valueOf(a1).equals(String.valueOf(b1));
  }

  public static void main(String[] args) {

    String a = "anagram";
    String b = "margana";
    boolean ret = isAnagram(a, b);
    System.out.println((ret) ? "Anagrams" : "Not Anagrams");
  }
}
