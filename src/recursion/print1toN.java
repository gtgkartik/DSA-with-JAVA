package recursion;

public class print1toN {

    static void print1toNmethod2(int i , int N){
        if(i==N){
            return  ;
        }
        System.out.print(i + " ");
        print1toNmethod2(i+1,N);
    }

    static int count = 1 ;
    static void print1toN(int N){
        if(count > N){
            return;
        }
        System.out.print(count+ " ");
        count++;
        print1toN(N);
    }
    public static void main(String[] args) {
        print1toN(10);
        print1toNmethod2(1, 10);
    }
}
