package scott.DLL;

class Node {
    Node prev, next ;
    int value ;

    Node (int value){
        this.value = value ;
    }
}

class DLL{
    Node head , tail ;

    DLL(int value){
        Node newNode = new Node(value);
        head = newNode ;
        tail = newNode ;
    }

    void getHead(){
        System.out.println("head: "+head.value);
    }

    void getTail (){
        System.out.println("tail: "+tail.value);
    }

    void printAll(){
        Node temp = head ;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next ;
        }
    }

    void append(int value){
        Node newNode = new Node(value);
        if(head== null){
            head = newNode ;
            tail= newNode;
        }else{
            newNode.prev = tail ;
            tail.next = newNode ;
            tail = newNode ;

        }
    }

    void removeLast(){
        if(head == tail){
            head = null; tail = null ;
        }else{
            Node prevNode = tail.prev ;
            prevNode.next=null ;
            tail.prev = null;
            tail = prevNode ;
        }
    }

    void prepend(int value){
        Node newNode = new Node(value);
        head.prev = newNode ;
        newNode.next = head ;
        head = newNode ;
    }

    void removeFirst(){
        Node nextNode = head.next ;
        nextNode.prev = null ;
        head.next = null ;
        head = nextNode ;
    }

    void insert(int index, int value){
        Node temp = head ;
        for(int i = 0 ; i < index; i ++){
            temp = temp.next ;
        }
        Node newNode = new Node(value);
        Node prevNode = temp.prev ;

        prevNode.next = newNode ;
        newNode.prev = prevNode ;
        newNode.next = temp ;
        temp.prev = newNode ;

    }

    void remove(int index){
        Node temp = head ;
        for(int i = 0 ; i < index ; i ++){
            temp = temp.next;
        }
        temp.prev.next = temp.next ;
        temp.next.prev = temp.prev ;
    }
}


public class DLLImplementation {

    public static void main(String[] args) {
        DLL dl = new DLL(2);
        dl.prepend(100);
        dl.removeFirst();
        dl.append(3);
        dl.insert(1,143);
        dl.printAll();
        dl.getHead();
        dl.getTail();
        dl.remove(1);
        dl.printAll();

    }
}
