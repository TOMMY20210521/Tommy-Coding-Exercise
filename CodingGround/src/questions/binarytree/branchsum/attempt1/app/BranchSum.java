package questions.binarytree.branchsum.attempt1.app;

import java.util.ArrayList;
import java.util.List;

class Solution {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    // Write your code here.

    List<Integer> result = new ArrayList<>();

    branchSum(0,root,result);
    branchSum(0,root,result);

    return result;
  }

  public static void branchSum(int sum,BinaryTree root,List<Integer> result) {
    if(root.left==null && root.right==null) {
      result.add(sum+root.value);
    }
    if(root.left!=null) branchSum(sum+root.value, root.left, result);
    if(root.right!=null) branchSum(sum+root.value, root.right, result);
  }
}

public class BranchSum {
  public static void main(String[] args) {
    
  }
}
