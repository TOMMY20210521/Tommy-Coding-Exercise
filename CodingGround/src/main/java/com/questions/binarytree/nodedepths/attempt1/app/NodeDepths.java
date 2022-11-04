package com.questions.binarytree.nodedepths.attempt1.app;

class Solution {

  static int sum;

  public static int nodeDepths(BinaryTree root) {
    // Write your code here.
    sum = 0;
    nodeDepth(0, root);
    return sum;
  }
  
  public static void nodeDepth(int level, BinaryTree root) {
    sum += level;
    if(root.left!=null) nodeDepth(level+1, root.left);
    if(root.right!=null) nodeDepth(level+1, root.right);
  }

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}

public class NodeDepths {
  public static void main(String[] args) {
    
  }
}
