/*Calculate the sum of digits of a number given by user. E.g.-
INUPT : 123        OUPUT : 6
INUPT : 12345        OUPUT : 15*/
import java.lang.*;
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre entero");
        int n = s1.nextInt();
        int ii=0, dig=0, sum=0, temp=0;
        temp = n;
        while (temp>9){
            temp /= 10;
            ii++;
        }
        while(n>=1){
            dig=n/(int)Math.pow(10,ii);
            n %= Math.pow(10,ii);
            sum += dig;
            ii--;
        }
        System.out.println("La suma de los dígitos es = "+sum);
    }
}