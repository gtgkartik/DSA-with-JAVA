package LeetCodePractise;
// asked in Adobe, Samsung  VISA
public class ReverseInteger {

    static int reverseInteger(int num){

        long rev = 0 ;

        while(num!=0){
            rev = rev*10+ num%10 ;

            num = num/10;
        }

        if(rev> Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return  0 ;
        }

            return (int) rev ;

    }

    public static void main(String[] args) {

        System.out.println(reverseInteger(-563847412));
    }
}
