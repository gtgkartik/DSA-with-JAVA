package LeetCodePractise.GreatestCommonDivisorOfStrings;

public class GreatestCommonDivisorOfStrings {


    // findd the gcd of a string

    static boolean canReplicate(String str, String subString){
        String temp  = subString ;
        int times = 2 ;
        while(true){
            if(temp.length()>str.length()){
                break ;
            }
            if(temp.equals(str)){
                return true ;
            }
            temp = subString.repeat(times);
            times++ ;
        }
        return false ;
    }

    static String gcd(String str1, String str2){
        String subString  = "" ;
            for(int i = 0 ; i < str2.length() ; i ++){
                subString = str2.substring(0,str2.length()-i) ;
                if(str1.length()%subString.length()==0 && str2.length()%subString.length()==0){
                    if(canReplicate(str2, subString)&& canReplicate(str1,subString)){
                        return subString;
                    }
                }
            }
            return "";

    }



    public static void main(String args[]){
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        System.out.println(gcd(str1,str2));

    }
}
