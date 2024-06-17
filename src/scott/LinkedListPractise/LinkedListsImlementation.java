package scott.LinkedListPractise;

class Node {
    int value ;
    Node next ;

    Node(int value){
        this.value  = value ;
        this.next = null ;
    }
}

class NewLinkedList{
    Node head ;
    Node tail ;
    int length ;

    NewLinkedList(int value){
        Node newnode = new Node(value);
        head = newnode;
        tail = newnode ;
        length=1 ;
    }

    void printList(){
        Node temp = head ;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next ;
        }
    }

    void prepend(int value){
        Node newNode = new Node(value);

    }

    void getHead (){
        System.out.println("head: " + head.value);
    }

    void getTail(){
        System.out.println("tail: " + tail.value);
    }
    void getLength(){
        System.out.println("length: "+ length);
    }

    void append(int value){
        Node newNode = new Node(value);
        if(length ==0 ){
            head = newNode;
            tail = newNode ;
            length++;
        }else{
            tail.next= newNode ;
            tail = newNode ;
            length++ ;
        }
    }

    void removeLast(){
        Node temp = head ;
        while(temp.next.next!=null){
            temp = temp.next ;
        }
        tail = temp ;
        tail.next = null ;
        length-- ;
    }

    void removeFirst(){
        Node temp = head ;
        temp = temp.next;
        head = temp ;
        length -- ;
    }
}

public class LinkedListsImlementation {
    public static void main(String[] args) {
        NewLinkedList list = new NewLinkedList(2);

        list.append(3);
        list.append(4);

        list.removeLast();
        list.removeFirst();

        list.printList();
        list.getHead();
        list.getTail();
        list.getLength();

    }
}
