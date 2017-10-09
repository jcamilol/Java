//Write a program in java to find the sum of the even and odd digits of the number which is given as input.
import java.lang.*;
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre entero");
        int n = s1.nextInt();
        int ii=0, dig=0, sumpar=0, sumimp=0, temp=0;
        temp = n;
        while (temp>9){
            temp /= 10;
            ii++;
        }
        while(n>=1){
            dig=n/(int)Math.pow(10,ii);
            n %= Math.pow(10,ii);
            if(dig%2==0)
                sumpar += dig;
            else
                sumimp += dig;
            ii--;
        }
        System.out.println("La suma de los dígitos pares es = "+sumpar);
        System.out.println("La suma de los dígitos impares es = "+sumimp);
    }
}