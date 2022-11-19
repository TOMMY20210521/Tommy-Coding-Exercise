package com.test.day1;

public class Day1 {
    public Day1() {
        int[] arr = {37,43,24,59,79,13};
        System.out.println(Day1.arraySearch(24, arr));
        System.out.println(Day1.arrayMaxNum(arr));

        // LinkedList
        LinkedListNode node1 = new LinkedListNode(1);
        LinkedListNode node2 = new LinkedListNode(2);
        LinkedListNode node3 = new LinkedListNode(3);
        LinkedListNode node4 = new LinkedListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Day1.LinkedListNode node5 = new Day1.LinkedListNode(5);
        node5.next = node2.next;
        node2.next = node5;

        System.out.println(Day1.LinkedList.toString(node1));

        System.out.println(Day1.LinkedList.findNode(node1, 5).value);
        // find size
        LinkedListNode head = new LinkedListNode(23);
        head.add(45).add(12).add(10).add(98).add(17).add(55);
        System.out.println(LinkedList.toString(head));
        System.out.println(LinkedList.findLinkedListSize(head));
        System.out.println(LinkedList.findMiddleNode(head));
        System.out.println(LinkedList.findMiddleNode2(head));
    }

    public static int arraySearch(int toSearch, int[] arr) {

        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] == toSearch) {
                return i;
            }
        }

        return -1;
    }

    public static int arrayMaxNum(int[] arr) {
        int max = arr[0];

        for (int j : arr) {
            if (j > max) max = j;
        }

        return max;
    }

    public static class LinkedListNode {
        public int value;
        public LinkedListNode next;

        private LinkedListNode() {}

        public LinkedListNode(int value) {
            this.value = value;
            next = null;
        }

        public LinkedListNode add(int value) {
            this.next = new LinkedListNode(value);
            return this.next;
        }
    }

    public static class LinkedList {
        public static String toString(LinkedListNode next) {
            if(next==null) return "";
            return next.value + " " + toString(next.next);
        }

        public static LinkedListNode findNode(LinkedListNode head, int toSearch) {
            LinkedListNode temp = head;

            while(temp!=null) {
                if(temp.value == toSearch) return temp;
                temp = temp.next;
            }

            return temp;
        }

        public static int findLinkedListSize(LinkedListNode head) {
            LinkedListNode temp = head;
            int size = 0;
            while(temp!=null) {
                temp = temp.next;
                size++;
            }
            return size;
        }

        public static int findMiddleNode(LinkedListNode head) {
            int size = findLinkedListSize(head);
            if(size==1) return head.value;
            LinkedListNode temp = head;
            int i = 0;
            while(i<size/2 && temp!=null) {
                temp = temp.next;
                i++;
            }
            return temp.value;
        }

        public static int findMiddleNode2(LinkedListNode head) {
            if(head==null) throw new IllegalArgumentException("head cannot be null");

            LinkedListNode quickPointer = head;
            LinkedListNode slowPointer = head;

            while(quickPointer != null && quickPointer.next!=null) {
                quickPointer = quickPointer.next.next;
                slowPointer = slowPointer.next;
            }

            return slowPointer.value;
        }
    }

}
