public class Palindrome {

    static boolean isPalindrome(int n){
        int reverse =0;
        int temp = n ;
        System.out.println(n);
        while(n!=0){
            int lastDigit = n%10 ;
            reverse = reverse*10 +lastDigit;
            n = n/10 ;
        };
        System.out.println(n);
        return reverse == temp ;
    };
    public static void main(String[] args) {
        System.out.println(isPalindrome(88));
    };
};
