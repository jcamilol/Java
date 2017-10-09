//Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers.
import java.lang.*;
import java.util.*;
class code{
    public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
    System.out.println("Entre entero");
    int m = s1.nextInt();
    System.out.println("Entre entero");
    int n = s1.nextInt();
    int mcd=1;
    int menor = Math.max(n,m);
        for(int ii=2; ii<=menor; ii++){
            if(n%ii==0 && m%ii==0){
                mcd*=ii;
                m/=ii;
                n/=ii;
                ii--;
            }
        }
    System.out.println("MCD("+(m*mcd)+","+(n*mcd)+") = "+mcd);
    }
}