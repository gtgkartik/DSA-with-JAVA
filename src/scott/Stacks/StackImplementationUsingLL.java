package scott.Stacks;

public class StackImplementationUsingLL {

    static class Stack{
        Node head ;
        class Node{
            Node next ;
            Node prev ;
            int val ;

            public Node(int val){
                this.next = null;
                this.prev = null;
                this.val = val ;
            }
        }

        public Stack(int val){
            Node newNode = new Node(val);
            head = newNode;
        }

        void peek(){
            System.out.println("peek element: " + head.val);
        }
        void push(int val){
            Node newNode = new Node(val);
            newNode.prev = head ;
            head.next = newNode;
            head = newNode ;
        }

        void pop(){
            Node prevNode = head.prev ;
            head = head.prev ;
            System.out.println("popped element: "+head.next.val);
            head.next = null ;
        }

        void prinStack(){
            Node temp = head ;

            while(temp!=null){
                System.out.println(temp.val);
                temp = temp.prev;
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack(2);
        st.push(10);
        st.push(69);
        st.push(420);
        st.push(69);
        st.push(420);
        st.peek();
        st.pop();
        st.prinStack();
        st.pop();
        st.prinStack();

    }
}
