package recursion;

public class print1toNBacktracking {

    static void print1toNBacktracking(int i , int N){

        if(i == 0){
            return  ;
        }
        print1toNBacktracking(i-1, N);

        System.out.println(i);
    }

    public static void main(String[] args) {
        print1toNBacktracking(3,3);
    }
}
