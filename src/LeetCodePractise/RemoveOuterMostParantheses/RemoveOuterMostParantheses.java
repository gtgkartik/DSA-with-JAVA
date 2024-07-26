package LeetCodePractise.RemoveOuterMostParantheses;

import java.util.Stack;

public class RemoveOuterMostParantheses {


    public static void main(String[] args) {
        String str = "(()())(())";
//        System.out.println(str.substring(1,str.length()-1));

        // converting a string to character array
        char arr[] = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        Stack<Character> stack = new Stack<>();
        String res = "";
        String word = "";
        for(char s : arr){
            if(s=='('){
                stack.push(s);
                word = word + '(';
            }else{
                stack.pop();
                word = word +  s;
                if(stack.isEmpty()){
                    word = word.substring(1,word.length()-1);
                    res = res + word ;
                    word = "";
                }
            }
        }
        System.out.println(res);
//        String finall = "" ;
//
//        String res = "";
//        if(str.charAt(i)=='('){
//            res = res + '(';
//            stack.push('(');
//        }else{
//            res = res + stack.pop();
//            if(stack.isEmpty()){
//                res.charAt(0) = '';
//                res.charAt(res.length()-1);
//            }
//        }
    }
}
