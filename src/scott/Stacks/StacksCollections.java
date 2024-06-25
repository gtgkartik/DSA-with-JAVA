package scott.Stacks;

import java.util.Stack;

public class StacksCollections {


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(13);
        st.push(133);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());

        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }
}
