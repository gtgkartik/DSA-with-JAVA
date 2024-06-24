package practise.Problems;

public class PascalsTriangle {

    static long findncr(int n , int r){
        long res = 1 ;
        for(int i = 0 ; i < r; i++){
            res = (long) (n-i) *res ;
            res =  res/(1+i) ;
        }
        return res ;
    }

    public static void main(String[] args) {
        System.out.println(findncr(5,4));
    }
}
