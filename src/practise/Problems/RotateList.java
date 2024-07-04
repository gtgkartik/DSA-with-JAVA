package practise.Problems;

public class RotateList {

    static class Node{
        Node next ;
        int val ;
        Node(int val){
            this.val = val ;
        }
    }
    static class LinkedList{
        Node head ;

        LinkedList(){
            this.head = null  ;
        }

        void add(int val){
            Node newnode = new Node( val);
           if(head == null){
                head = newnode ;
                head.next = null ;
           }else{
               newnode.next = head ;
               head = newnode ;
           }

        }
        void printList(){
            Node temp =  head ;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next ;
            }
        }

        void rotate(int  k ){
            while(k>0) {
                Node temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                Node insertBegnning = temp.next;
                temp.next = null;
                insertBegnning.next = head;
                head = insertBegnning;
                k-- ;
            }
        }
    }



    public static void main(String[] args) {
        LinkedList list  = new LinkedList();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("Before Rotation");
        list.printList();
        System.out.println();
        list.rotate(3);
        System.out.println("After Rotation");

        list.printList();


    }
}
