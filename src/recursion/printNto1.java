package recursion;

public class printNto1 {

    static int count  ;
    static int printNto1(int N){
        if (N==0){
            return 0;
        }
        System.out.print(N +" ");
        return printNto1(N-1);
    }

    public static void main(String[] args) {
        printNto1(10);
    }
}
