package scott.LinkedListPractise.DLL;

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
        System.out.println(head.value);
    }

    void getTail (){
        System.out.println(tail.value);
    }

    void printAll(){
        Node temp = head ;
        while(temp!=null){
            System.out.println(temp.value);
        }
    }
}


public class DLLImplementation {

    public static void main(String[] args) {
        DLL dl = new DLL(2);
        dl.getHead();
    }
}
