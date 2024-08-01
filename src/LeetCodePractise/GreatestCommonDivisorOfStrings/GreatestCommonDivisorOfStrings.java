package LeetCodePractise.GreatestCommonDivisorOfStrings;

public class GreatestCommonDivisorOfStrings {

    static String gcdofString(String str){
        String subString = "";

        for(int i = 0 ; i < str.length() ; i ++){
            subString = subString+ str.charAt(i);
            String temp = subString ;
            int times = 2 ;
            while(true){
                if(temp.length()>str.length()){
                    break ;
                }
                if(temp.equals(str) && temp.length()== str.length()){
                    return subString ;
                }
                temp = subString.repeat(times);
                times++ ;
            }
        }
        return subString ;
    }

    static  String gcd(String str1, String str2){
        if (gcdofString(str1).equals(gcdofString(str2))){
            return gcdofString(str1);
        }else{
            return "";
        }
    }



    public static void main(String args[]){
        String str1 = "ABABABAB";
        String str2 = "ABAB";
        System.out.println(gcd(str1,str2));





    }
}
