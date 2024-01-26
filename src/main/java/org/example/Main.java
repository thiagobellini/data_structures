package org.example;

import org.example.queuesFIFO.Queue;
import org.example.satcksLIFO.Stack;

public class Main {
    public static void main(String[] args) {
        // -------Stacks-------
        /*Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());*/
        // ====================

        // -------Queues-------
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println(queue);
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue);
        // ====================
    }
}