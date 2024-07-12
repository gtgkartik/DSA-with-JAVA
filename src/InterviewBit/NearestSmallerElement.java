package InterviewBit;

import java.util.*;

public class NearestSmallerElement {

    static ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < arr.size() ; i ++){
            int target = arr.get(i);
            boolean found = false ;
            while(!stack.isEmpty() ){
                int num = stack.peek();
                if(num<target){
                    res.add(num);
                    stack.push(num);
                    found = true ;
                    break ;
                }else{
                    stack.pop();
                }
            }
            if(!found){
                    res.add(-1);
                    stack.push(target);
            }
        }
        return res;
    }


    static ArrayList<Integer> prevSmaller2(ArrayList<Integer> arr) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < arr.size() ; i ++){
            int target = arr.get(i);
            boolean found = false ;
            while(!stack.isEmpty() && stack.peek()> target){
                    stack.pop();
            }
            if(stack.isEmpty()){
                res.add(-1);
            }else{
                res.add(stack.peek());
            }
            stack.push(target);
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(10);
        arr.add(8);

        ArrayList<Integer> result = prevSmaller2(arr);
        System.out.println(result);
    }
}
