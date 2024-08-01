package LeetCodePractise.ReverseWordsInAString;

public class ReverseWordsInAString {
    public static void main(String [] args){
//        String  str = "this is kartik kumar  ";
//        str = str.trim();
//        System.out.println(str);

        String sentence = "the sky is blue";
        sentence = sentence.trim();
        String[] words = sentence.split(" ");

        for(int  i = 0 ; i < words.length /2; i ++){
            int  j = words.length-i -1 ;
            String temp = words[i];
            words[i] =  words[j];
            words[j]= temp ;
        }
        for(String word: words){
            System.out.print(word+" ");
        }
    }
}
