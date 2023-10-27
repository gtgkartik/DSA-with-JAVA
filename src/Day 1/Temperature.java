public class Temperature {
    static double Ctf(double temperature){
        double result = (9*(temperature +32))/5 ;
        return result ;
    };

    public static void main(String[] args) {
        System.out.println(Ctf(35.5));
    }
}
