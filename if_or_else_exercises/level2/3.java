/*A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895*/
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese un entero de 4 caracteres");
        int n = s1.nextInt();
        int dig1 = n/1000;
            n %= 1000;
        int dig2 = n/100;
            n %= 100;
        int dig3 = n/10;
            n %= 10;
        int dig4 = n;
        int newn = (dig4*1000)+(dig3*100)+(dig2*10)+(dig1);
        System.out.println(newn); 
    }
}