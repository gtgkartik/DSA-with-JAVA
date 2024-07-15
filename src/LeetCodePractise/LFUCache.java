package LeetCodePractise;
import java.util.HashMap;

public class LFUCache {
    int capacity;
    int minFrequency;
    HashMap<Integer, Node> map;
    HashMap<Integer, DLL> frequencyMap;

    static class Node {
        int key;
        int val;
        int frequency;
        Node prev;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.frequency = 1;
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
            Node left = node.prev;
            Node right = node.next;
            left.next = right;
            right.prev = left;
        }

        boolean isEmpty() {
            return head.next == tail;
        }
    }

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFrequency = 1;
        this.map = new HashMap<>();
        this.frequencyMap = new HashMap<>();
        frequencyMap.put(1, new DLL());
    }

    int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        updateNode(node);
        return node.val;
    }

    void put(int key, int value) {
        if (capacity == 0) return;

        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            updateNode(node);
        } else {
            if (map.size() >= capacity) {
                DLL minFreqDLL = frequencyMap.get(minFrequency);
                Node toRemove = minFreqDLL.tail.prev;
                minFreqDLL.removeNode(toRemove);
                map.remove(toRemove.key);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            minFrequency = 1;
            frequencyMap.get(1).addNode(newNode);
        }
    }

    void updateNode(Node node) {
        int freq = node.frequency;
        DLL oldDLL = frequencyMap.get(freq);
        oldDLL.removeNode(node);

        if (freq == minFrequency && oldDLL.isEmpty()) {
            minFrequency++;
        }

        node.frequency++;
        frequencyMap.computeIfAbsent(node.frequency, k -> new DLL()).addNode(node);
    }

    public static void main(String[] args) {
        LFUCache lfu = new LFUCache(2);
        lfu.put(1, 1);
        lfu.put(2, 2);
        System.out.println(lfu.get(1)); // returns 1
        lfu.put(3, 3); // evicts key 2
        System.out.println(lfu.get(2)); // returns -1 (not found)
        System.out.println(lfu.get(3)); // returns 3
        lfu.put(4, 4); // evicts key 1
        System.out.println(lfu.get(1)); // returns -1 (not found)
        System.out.println(lfu.get(3)); // returns 3
        System.out.println(lfu.get(4)); // returns 4
    }
}
