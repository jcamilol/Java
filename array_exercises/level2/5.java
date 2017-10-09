// Input any number. Find the sum of the digits of the number using a recursive function. 
import java.util.*;
class code{
    public static int suma(int n, int sum){
        if(n<10){
            sum+=n;
            return sum;
        }
        else{
            sum += n%10;
            n/=10;
            return suma(n,sum);
        }
    }
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre entero");
        int n = s1.nextInt();
        int sum = 0;
        System.out.println("suma de los dígitos = "+suma(n,sum));
    }
}