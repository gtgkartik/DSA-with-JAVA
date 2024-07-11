package practise.Problems;

public class ReverseWordsInaString {
static String reverseSentence1(String s){
    s= s + " ";
    String res = "";
    String word = "";
    for(char ch :  s.toCharArray()){
        if(ch != ' '){
            word = word + ch ;
        }else{
            res = word+ " " + res ;
            word= "";
        }
    }
    res =  res.trim();

    return res ;
}

static String reverseSentence2(String s){
    String res = "";
    for(char ch :  s.toCharArray()){
        if(ch!= ' '){
            res = res +  ch ;
        }else{
            res =  ch+ res ;
        }
    }
    return res ;
}

//static String reverseSTentence3(String s){
//    String res = "";
//    while(char ch != ' '){
//        res =  res +
//    }
//    return res ;
//}
    public static void main(String[] args) {
        System.out.println(reverseSentence1("hi I am Kartik"));
        System.out.println(reverseSentence2("hi I am Kartik"));

    }
}
