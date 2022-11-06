package tommycodingexercise.model.classmaterial.mylinklist.doubly;

public class DoublyLinkedList {
  Node head;

  public Node peek() {
    return this.head;
  }

  public void push(int data) {
    Node newNode = new Node(data);

    newNode.setNext(head);
    if(this.head!=null) head.setPrev(newNode);

    this.head = newNode;
  }

  public DoublyLinkedList add(int data) {
    
    if(this.head==null) {
      this.head = new Node(data);
      return this;
    }
    
    Node newNode = new Node(data);
    Node temp = head;

    while(temp.getNext()!=null) {
      temp = temp.getNext();
    }

    temp.setNext(newNode);
    newNode.setPrev(temp);

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
