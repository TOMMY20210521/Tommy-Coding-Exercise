package com.tommycodingexercise.model;

public class Node {
  int data;
  private Node next;

  Node(int d) {
    data = d;
    next = null;
  }

  public Node getNext() {
    return this.next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "(" + this.data + ")";
  }
}
