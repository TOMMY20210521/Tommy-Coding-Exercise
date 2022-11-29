package com.test.exercises;

public class Exercise3 {

    public Exercise3() {
        int[] test = {7, 3, 5, 1, 2, 4};
        System.out.println(maxProfit(test));
    }

    public static int maxProfit(int[] stock) {
        if(stock.length <= 0) return 0;
        int max = 0;
        int reference = stock[0];
        for(int i=1 ; i<stock.length ; i++) {
            if(stock[i] - reference > max) max = stock[i] - reference;
            if(reference > stock[i]) reference = stock[i];
        }
        return max;
    }

}
