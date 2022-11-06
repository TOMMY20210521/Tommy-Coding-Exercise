package tommycodingexercise.app;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import tommycodingexercise.model.classmaterial.mylinklist.doubly.DoublyLinkedList;
import tommycodingexercise.model.classmaterial.mylinklist.singly.SinglyLinkedList;

public class CodingPractice {
  public static void main(String[] args) {
    // Declaration & Initialization
    LinkedList<String> strings = new LinkedList<>();

    // Adding elements
    strings.add("I");
    strings.add("C");
    strings.add("E");
    strings.add("N");
    strings.addLast("T");
    strings.addFirst("V");
    strings.add(2,"N");
    System.out.println(strings);

    // Removing elements
    strings.remove("E");
    strings.remove(4);
    strings.removeFirst();
    strings.removeLast();
    System.out.println(strings);

    // Set elements
    strings.set(2, "F");
    System.out.println(strings);

    // Access by index
    System.out.println(strings.get(1));

    // Access by loop
    for(String str : strings) {
      System.out.println(str + " ");
    }

    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    singlyLinkedList.add(0);
    singlyLinkedList.add(2).add(3);
    singlyLinkedList.add(4);
    singlyLinkedList.add(2);
    singlyLinkedList.add(4);
    singlyLinkedList.add(5);
    singlyLinkedList.add(4);
    singlyLinkedList.push(0);
    singlyLinkedList.push(3);
    singlyLinkedList.push(2);
    
    singlyLinkedList.deleteNode(2).deleteNode(0);
    singlyLinkedList.deleteNode(0);
    singlyLinkedList.deleteNode(5);

    System.out.println(singlyLinkedList.toString());

    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

    doublyLinkedList.add(4);
    // doublyLinkedList.add(2);
    // doublyLinkedList.add(4);
    // doublyLinkedList.add(2);
    // doublyLinkedList.add(3);
    // doublyLinkedList.add(5);
    // doublyLinkedList.add(7);
    // doublyLinkedList.push(10);
    // doublyLinkedList.push(23);
    // doublyLinkedList.push(5);
    
    // doublyLinkedList.deleteNode(2);
    // doublyLinkedList.deleteNode(0);
    // doublyLinkedList.deleteNode(5);

    System.out.println(doublyLinkedList.toString());

    Set<Integer> integers = new HashSet<>();
    integers.add(100);
    integers.add(5);
    integers.add(200);
    integers.add(100);
    System.out.println(integers);    
  }
}
