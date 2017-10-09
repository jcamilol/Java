 //Write a program to take two integer inputs from user and print sum and product of them. 
 import java.util.*;
 class code{
     public static void main(String[] args){
         Scanner s1 = new Scanner(System.in);
         System.out.println("Entre primer entero");
         int a = s1.nextInt();
         System.out.println("Entre segundo entero");
         int b = s1.nextInt();
         System.out.println("La suma de los dos enteros es "+(a+b));
         System.out.println("El producto de los dos enteros es "+(a*b));
     }
 }