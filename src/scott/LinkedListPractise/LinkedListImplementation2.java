package scott.LinkedListPractise;


class LinkedList {
    Node head ;
    Node tail ;
    int value ;
    class Node {
        Node next ;
        int value ;

        public Node(int value){
            this.value = value ;
            this.next = null ;
        }
    }

    public void printAll(){
        Node temp = head ;
        while(temp !=null){
            System.out.println(temp.value);
            temp = temp.next ;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(head==null){
            head = newNode ;
            tail = newNode ;
        }else{
            tail.next = newNode ;
            tail=newNode;
        }
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(head ==null){
            head = newNode;
            tail= newNode;
        }else{
            newNode.next = head ;
            head = newNode ;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode ;
        tail = newNode;
    }
}
public class LinkedListImplementation2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(2);
        list.append(5);
        list.prepend(100);
        list.printAll();
    }
}
