package com.test.day2;

import javax.naming.spi.StateFactory;
import java.util.Stack;

public class MyQueue {

    public Stack stack;

    MyQueue() {
        this.stack = new Stack();
    }

    public MyQueue(Stack stack) {
        this.stack = stack;
    }

    public void enqueue(int item) {
        Stack newStack = new Stack();

        while(newStack.push(stack.pop()) != null) {

        }

        newStack.push(item);

        while(stack.push(newStack.pop()) != null) {

        }

    }

    public void dequeue() {
        Stack newStack = new Stack();

        while(newStack.push(stack.pop()) != null) {

        }

        newStack.pop();

        while(stack.push(newStack.pop()) != null) {

        }
    }

}
