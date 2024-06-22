package scott.Stacks;

public class QueueImplementationUsingArrayList {

    static class Queue{
        Node front ;
        Node last ;

            class Node{
                Node next ; Node prev ;
                int val ;
                Node(int val){
                    this.val = val ;
                    this.next = null ;
                    this.prev = null ;
                }
            }
            Queue(int val){
                Node newNode = new Node(val);
                front = newNode ;
                last = newNode ;
            }

            void enqueue(int val){
                Node newNode = new Node(val);
                newNode.prev = last ;
                last.next = newNode ;
                last = newNode ;

            }

            void printQueue(){
                Node temp = front ;

                while(temp!=null){
                    System.out.println();
                    System.out.print(temp.val + " ");
                    temp = temp.next ;

                }
            }

        void dequeue(){
           front = front.next ;
           front.prev = null ;
        }


    }

    public static void main(String[] args) {
        Queue q = new Queue(69);
        q.enqueue(420);
        q.dequeue();
        q.printQueue();

    }
}
