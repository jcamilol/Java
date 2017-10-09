/*Write a program to find square of a number.
E.g.-
INPUT : 2        OUTPUT : 4
INPUT : 5        OUTPUT : 25 */
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese un número");
        double n = s1.nextDouble();
        double sq = n*n;
        System.out.println("El cuadrado del número es "+(sq));
    }
}