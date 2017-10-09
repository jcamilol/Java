//Take as input a fraction in the form a/b. Convert the same into lowest terms and print.
//(Lowest terms examples 3/12 = 1/4). 
import java.util.*;
import java.lang.*;
class code{
    public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
    System.out.println("Entre numerador");
    int a = s1.nextInt();
    System.out.println("Entre denominador");
    int b = s1.nextInt();
    System.out.print(a+"/"+b+" = ");
    int min = Math.min(a,b);    
        for(int ii=2; ii<=min; ii++){
            if(a%ii==0 && b%ii==0){
                a/=ii;
                b/=ii;
                ii--;
            }
        }
    System.out.println(a+"/"+b);
    }
}