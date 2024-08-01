package LeetCodePractise.ReverseVowelsOfAString;

import java.util.HashSet;

public class ReverseVowelsOfAString {


    public static void main(String args[]){
        String s = "aA" ;
//        s = s.toLowerCase();
        int  i = 0 ;
        int  j = s.length()-1 ;
        char[] arr =  s.toCharArray();


        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        while(i<j){
            if(set.contains(arr[i]) && set.contains(arr[j]) ){
                char temp = arr[i];
                arr[i] =  arr[j];
                arr[j] = temp ;
                i++;
                j-- ;
            }else if(set.contains(arr[i])){
                j--;
            }else if(set.contains(arr[j])){
                i++ ;
            }else{
                i++ ;
                j-- ;
            }
        }

        String res = "";

        for(char ch : arr){
            res =  res+ch ;
        }

        System.out.println(res);
    }
}
