/*A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500.*/
import java.lang.*;
class code{
    public static void main(String[] args){
        for(int m=100; m<=999; m++){
            int n = m;
            int dig1 = n/100;
            n %= 100;
            int dig2 = n/10;
            n %= 10;
            int dig3 = n;
            if((Math.pow(dig1,3)+Math.pow(dig2,3)+Math.pow(dig3,3)) == m)
                System.out.println(m);  
        }
    }
}