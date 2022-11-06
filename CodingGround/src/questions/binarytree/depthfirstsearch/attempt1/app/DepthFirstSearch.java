package com.questions.binarytree.depthfirstsearch.attempt1.app;

import java.util.ArrayList;
import java.util.List;

class Solution {
  // Do not edit the class below except
  // for the depthFirstSearch method.
  // Feel free to add new properties
  // and methods to the class.
  static class Node {
    String name;
    List<Node> children = new ArrayList<>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> depthFirstSearch(List<String> array) {
      // Write your code here.
      array.add(name);
      for(Node n: this.children) {
        n.depthFirstSearch(array);
      }
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}

public class DepthFirstSearch {
  public static void main(String[] args) {
    
  }
}
