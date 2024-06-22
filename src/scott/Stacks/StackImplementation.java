package scott.Stacks;

import java.util.ArrayList;

public class StackImplementation {

    static class Stack {
        ArrayList<Integer> arr ;
        int top ;
        int val ;

        public Stack(int val){
            arr = new ArrayList<>();
            arr.add(val);
            top = 0 ;
        }

        void push(int val){
            arr.add(val);
            top++;
        }

        void peek(){
            System.out.println("peek item: "+arr.get(top));
        }

        void pop(){
            System.out.println("popped item: "+ arr.get(top));
            top--;

        }

        void printAll(){
            for(int  i=0; i<=top;i++){
                System.out.print(arr.get(i)+" ");
            }
        }
    }


    public static void main(String[] args) {
        Stack st = new Stack(2);
        st.push(3);
        st.push(45);
        st.push(2);
        st.push(20);
        st.pop();
        st.peek();
        st.printAll();
    }
}
