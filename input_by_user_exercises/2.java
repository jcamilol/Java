//Take two integer inputs from user. First calculate the sum of two then product of two. Finally, print the sum and product of both obtained resluts. 
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre el primer entero");
        int a = s1.nextInt();
        System.out.println("Entre el segundo entero");
        int b = s1.nextInt();
        int suma = a+b;
        int prod = a*b;
        System.out.println("La suma de los dos enteros es "+suma);
        System.out.println("El producto de los dos enteros es "+prod);
        System.out.println("La suma de la suma y el producto es "+(suma+prod));
        System.out.println("El producto de la suma y el producto es "+(suma*prod));
    }
}