package questions.linkedlist.removeduplicatefromlinkedlist.attempt2.app;

class Solution {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }

    public LinkedList add(int value) {
      LinkedList temp = this;
      while(temp.next!=null) {
        temp = temp.next;
      }
      temp.next = new LinkedList(value);
      return this;
    }

    public LinkedList(int value, LinkedList next) {
      this.value = value;
      this.next = next;
    }

    public static void print(LinkedList l) {
      if(l==null) return;
      System.out.println(l.value);
      print(l.next);
    }
  }

  public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
    // Write your code here.
    if(linkedList==null) return null;

    // linkedList.next = (linkedList.next.value!=linkedList.value) ? 

    return linkedList;
  }

}

public class RemoveDuplicatesFromLinkedList {
  public static void main(String[] args) {
    // Solution.LinkedList a =
    //   new Solution.LinkedList(1,
    //   new Solution.LinkedList(1,
    //   new Solution.LinkedList(1,
    //   new Solution.LinkedList(2,
    //   new Solution.LinkedList(3,
    //   new Solution.LinkedList(4,
    //   new Solution.LinkedList(4
    //   )))))));
    
    Solution.LinkedList a = new Solution.LinkedList(1);
    a.add(1)
      .add(2)
      .add(2)
      .add(2)
      .add(5)
      .add(6)
      ;

    Solution.LinkedList.print(a);

    System.out.println();
    Solution.removeDuplicatesFromLinkedList(a);

    Solution.LinkedList.print(a);


  }
}
