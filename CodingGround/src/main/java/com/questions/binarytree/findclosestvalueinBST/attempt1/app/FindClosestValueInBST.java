package com.questions.binarytree.findclosestvalueinBST.attempt1.app;

class Solution {
  public static int findClosestValueInBst(BST tree, int target) {
    if(target==tree.value) return tree.value;
    if(target<tree.value) {
      if(tree.left==null) return tree.value;
      int temp = findClosestValueInBst(tree.left, target);
      return Math.abs(tree.value-target)<Math.abs(temp-target)?tree.value:temp;
    } else {
      if(tree.right==null) return tree.value;
      int temp = findClosestValueInBst(tree.right, target);
      return Math.abs(tree.value-target)<Math.abs(temp-target)?tree.value:temp;
    }
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}

public class FindClosestValueInBST {
  public static void main(String[] args) {
    
  }
}
