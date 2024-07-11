package practise.Problems;

public class FindCarry {


    public static void main(String[] args) {
        int num1  = 123 ;
        int num2 =  6789;
        int carry = 0 ;
        int prevcarry = 0 ;
        int carrycount ;

        while(num1!=0 &num2!=0){
            int ld1 = num1%10 ;
            int ld2 = num2%10 ;
            int res =  ld1+ld2+prevcarry ;
            if(res>9){
                carry++ ;
                prevcarry =carry ;
            }
            num1 = num1/10 ;
            num2 = num2/10 ;
        }
        System.out.println(carry+1);
    }
}
