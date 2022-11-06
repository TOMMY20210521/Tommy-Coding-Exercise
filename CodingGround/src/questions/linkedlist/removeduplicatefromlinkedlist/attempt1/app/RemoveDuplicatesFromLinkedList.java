package questions.linkedlist.removeduplicatefromlinkedlist.attempt1.app;

class Solution {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
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

    LinkedList temp1 = linkedList;
    while(temp1!=null) {
      LinkedList temp2 = temp1.next;
      while(temp2!=null&&temp2.value==temp1.value) {
        temp2 = temp2.next;
      }
      temp1.next = temp2;
      temp1 = temp1.next;
    }

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
    
      Solution.LinkedList a =
      new Solution.LinkedList(1,
      new Solution.LinkedList(2,
      new Solution.LinkedList(3,
      new Solution.LinkedList(4
      ))));

    Solution.LinkedList.print(a);

    System.out.println();
    Solution.removeDuplicatesFromLinkedList(a);

    Solution.LinkedList.print(a);


  }
}
