package recursion;

public class print1toN {

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
    }
}
