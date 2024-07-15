package LeetCodePractise;

import java.util.ArrayList;
import java.util.Stack;


    public class ImplementQueueUsingStack {

        static class MyQueue {
            Node front;
            Node rear;

            static class Node {
                Node next;
                Node prev;
                int val;

                Node(int val) {
                    this.val = val;
                }

            }


            public void push(int x) {
                Node newNode = new Node(x);
                if (front == null) {
                    front = newNode;
                    rear = newNode;
                } else {
                    Node temp = rear;
                    rear.next = newNode;
                    rear = newNode;
                    rear.prev = temp;
                }
            }

            public int pop() {
                Node temp = front;

                if (rear == front) {
                    rear = null;
                    front = null;
                    return temp.val;
                } else {
                    front = front.next;
                }

                return temp.val;
            }

            public int peek() {
                return front.val;
            }

            public boolean empty() {
                if (rear == null && front == null) {
                    return true;
                }
                return false;
            }


        public static void main(String[] args) {
            MyQueue q = new MyQueue();
            q.push(1);
            q.push(2);
            System.out.println(q.peek());
            System.out.println(q.pop());
            System.out.println(q.empty());

        }
    }
}
