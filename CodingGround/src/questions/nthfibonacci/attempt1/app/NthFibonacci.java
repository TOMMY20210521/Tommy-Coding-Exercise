package questions.nthfibonacci.attempt1.app;

class Solution {
  public static int getNthFib(int n) {
    // Write your code here.
    if(n==1) return 0;
    if(n==2) return 1;

    return getNthFib(n-1) + getNthFib(n-2);
  }
}

public class NthFibonacci {
  public static void main(String[] args) {
    
  }
}
