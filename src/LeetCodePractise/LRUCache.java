package LeetCodePractise;

import java.util.HashMap;

public class LRUCache {
    int capacity;
    HashMap<Integer, Node> map;
    DLL dll;

    static class Node {
        Node prev;
        Node next;
        int key;
        int val;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    static class DLL {
        Node head;
        Node tail;

        DLL() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        void addNode(Node node) {
            Node temp = head.next;
            head.next = node;
            node.prev = head;
            node.next = temp;
            temp.prev = node;
        }

        void removeNode(Node node) {
            Node prev = node.prev;
            Node next = node.next;
            prev.next = next;
            next.prev = prev;
        }

        Node removeLast() {
            if (tail.prev == head) {
                return null;
            }
            Node last = tail.prev;
            removeNode(last);
            return last;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        dll = new DLL();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            dll.removeNode(node);
            dll.addNode(node);
            return node.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            dll.removeNode(node);
            dll.addNode(node);
        } else {
            if (map.size() == capacity) {
                Node last = dll.removeLast();
                map.remove(last.key);
            }
            Node newNode = new Node(key, value);
            dll.addNode(newNode);
            map.put(key, newNode);
        }
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        lru.put(1, 1);
        lru.put(2, 2);
        System.out.println(lru.get(1)); // returns 1
        lru.put(3, 3); // evicts key 2
        System.out.println(lru.get(2)); // returns -1 (not found)
        lru.put(4, 4); // evicts key 1
        System.out.println(lru.get(1)); // returns -1 (not found)
        System.out.println(lru.get(3)); // returns 3
        System.out.println(lru.get(4)); // returns 4
    }
}
