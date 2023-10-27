public class TrailingZeros {
     static int factorial(int n){
         if (n==1){
             return 1;
         }
        return n*factorial(n-1);
    }
    static int NoOfZeros(int n){
            int count = 0 ;
        while(n%10==0){
            count ++ ;
            n=n/10 ;
        };
        return count ;
    };
    public static void main(String[] args) {
        int factorialValue = factorial(5);
        System.out.println(  NoOfZeros(factorialValue));

    }
}
