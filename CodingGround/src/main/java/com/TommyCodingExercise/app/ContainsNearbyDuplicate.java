package com.tommycodingexercise.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Nums {
  int num;
  int index;

  public Nums(int num, int index) {
    this.num = num;
    this.index = index;
  }

  public int getIndex() {
    return index;
  }

  public int getNum() {
    return num;
  }
}

public class ContainsNearbyDuplicate {

  public static boolean containsNearbyDuplicate(int[] nums, int k) {

    if(nums.length<=1) return false;

    if(k>=nums.length) k=nums.length-1;

    List<Nums> arr = new ArrayList<>();

    for(int i=0 ; i<nums.length ; i++) {
      arr.add(new Nums(nums[i], i));
    }

    Comparator<Nums> compareNum = (x1, x2) -> Integer.compare(x1.getNum(), x2.getNum());
    Comparator<Nums> compareIndex = (x1, x2) -> Integer.compare(x1.getIndex(), x2.getIndex());

    Collections.sort(arr,compareNum.thenComparing(compareIndex));

    for(int i=0 ; i<arr.size()-1 ; i++) {
      if(arr.get(i).getNum()==arr.get(i+1).getNum() && Math.abs(arr.get(i).getIndex()-arr.get(i+1).getIndex())<=k)
        return true;
    }

    return false;
  }


  public static void main(String[] args) {
    int[] test1 = { 1, 2, 3, 5, 5, 3, 4 };
    int[] test2 = { 99,99 };

    System.out.println(containsNearbyDuplicate(test1, 3));
    System.out.println(containsNearbyDuplicate(test2, 3));

    // System.out.println(Solution.containsNearbyDuplicate(test1, 2));
    // System.out.println(Solution.containsNearbyDuplicate(test1, 3));
    // System.out.println(Solution.containsNearbyDuplicate(test1, 4));
  }
}
