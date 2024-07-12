package LeetCodePractise;


import java.util.ArrayList;

class MyStack {
int top = -1 ;
ArrayList<Integer> arr ;

public void push(int x){
    arr.add(x);
    top++ ;
}
public int pop(){
    int num = arr.remove(top);
    top-- ;
    return num;
};

public boolean empty(){
    if(top!=-1){
        return false;
    }else{
        return true ;
    }
}

public int top (){

    return arr.get(top);
}

    MyStack(){
    arr = new ArrayList<>();
    }
}

public class ImplementStackUsingQueues {

    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(1);
        st.push(2);
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}
