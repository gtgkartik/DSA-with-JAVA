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
            System.out.print(temp.value+ " ");
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

    public void getIndex(int index){
        Node temp = head ;
        for(int i = 0 ; i < index; i ++){
            temp = temp.next ;
        }
        System.out.println("value at index: " + temp.value);
    }

    public void setIndex(int index, int value){
        Node temp = head ;

        for(int i = 0; i<index; i++){
            temp = temp.next ;
        }
        System.out.println("value: " + temp.value);
        temp.value = value ;
        System.out.println("updated value: " + temp.value);
    }

    public void insert(int index, int value){
        Node temp = head ;
        for(int i = 0 ; i < index ; i ++){
            temp = temp.next ;
        }
        Node newNode = new Node(value);
        Node next = temp.next ;
        temp.next = newNode;
        newNode.next = next ;
    }

    public void remove(int index){
        Node temp = head ;
        for( int i=0 ; i<index-1; i ++){
            temp = temp.next;
        }

        Node next = temp.next.next ;
        temp.next = next ;

    }

    public void reverse() {
        Node prev =null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev ;
        tail = head ;
    }


    public void getHead(){
        System.out.println("head:" + head.value);
    }
    public void getTail(){
        System.out.println("tail: "+ tail.value);
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
        list.setIndex(0,200);
        list.insert(1,1000);
        list.remove(1);
        list.append(9);
        list.append(10);
        list.printAll();
        list.getIndex(2);
        list.getHead();
        list.getTail();
        list.reverse();
        list.printAll();
        list.getHead();
    }
}
