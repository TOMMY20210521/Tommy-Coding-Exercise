package com.tommycodingexercise.model.mylinklist.singly;

public class SinglyLinkedList {
  Node head;

  /*
   * delete node that have data equal to key
  */
  public SinglyLinkedList deleteNode(int key) {
    if(this.head==null) return this;
    if(head.getData()==key) {
      head = head.getNext();
      return this;
    }

    Node temp = head;
    Node prev = null;

    while(temp!=null && temp.getData()!=key) {
      prev = temp;
      temp = temp.getNext();
    }

    if(temp==null) return this;

    prev.setNext(temp.getNext());

    return this;
    
  }

  /*
   * add node to the end of the list
   */
  public SinglyLinkedList add(int data) {
    Node temp = head;

    if(temp==null) {
      this.head = new Node(data);
      return this;
    }

    while(temp.getNext()!=null) {
      temp = temp.getNext();
    }

    temp.setNext(new Node(data));

    return this;
  }

  public SinglyLinkedList push(int data) {
    Node newHead = new Node(data);
    newHead.setNext(head);
    head = newHead;
    return this;
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


