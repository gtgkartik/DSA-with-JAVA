package recursion;

public class sum1toN {

    static int count = 0 ;
    static int sum = 0 ;
    static void sum1toN(int N){
        if(count == N){
            return ;
        }
        count++;
        sum += count ;
        sum1toN(N);
    }

    public static void main(String[] args) {
        sum1toN(5);
        System.out.println(sum);
    }
}
