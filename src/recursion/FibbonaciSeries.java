package recursion;

public class FibbonaciSeries {

    static int series(int  n ){

        if( n ==1 ||  n ==2){
            return 1 ;
        }

        return series(n-1) + series(n-2);

    }

    public static void main(String[] args) {

        System.out.println(series(3));
    }
}
