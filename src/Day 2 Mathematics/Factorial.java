public class Factorial {
    static int factorial(int n){
        if(n==0){
            return 1 ;
        };
        int temp = n ;
        int result = n ;
        while(temp >1){
            result = result*(temp-1);
            temp--;
        }
        return result ;
    };

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
