package com.tommycodingexercise.model;

public class MyLinkedList {
  Node head;

  /*
   * delete node that have data equal to key
  */
  public void deleteNode(int key) {
    if(this.head==null) return;
    if(head.getData()==key) {
      head = head.getNext();
      return;
    }

    Node temp = head;
    Node prev = null;

    while(temp!=null && temp.getData()!=key) {
      prev = temp;
      temp = temp.getNext();
    }

    if(temp==null) return;

    prev.setNext(temp.getNext());
    
  }

  /*
   * add node to the end of the list
   */
  public void add(int data) {
    Node temp = head;

    if(temp==null) {
      this.head = new Node(data);
      return;
    }

    while(temp.getNext()!=null) {
      temp = temp.getNext();
    }

    temp.setNext(new Node(data));
  }

  @Override
  public String toString() {
    Node temp = head;
    String result = "";

    if(temp==null) return "[]";

    while(temp.getNext()!=null) {
      result = result + temp.toString() + "->";
      temp = temp.getNext();
    }
    result = result + temp.toString();
    return "[" + result + "]";
  }
}


