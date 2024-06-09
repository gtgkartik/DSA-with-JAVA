package recursion;

public class printNtimes {
    static int count = 0;

    static void printNtimes(int n){
       if(count == n){
           return ;
       }
        System.out.print("kartik" + " ");
        count++ ;
        printNtimes(n);
    }

    public static void main(String[] args) {
        printNtimes(5);
    }
}
