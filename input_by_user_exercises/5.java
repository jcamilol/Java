 //Take side of a square from user and print area and perimeter of it. 
 import java.util.*;
 class code{
     public static void main(String[] args){
         Scanner s1 = new Scanner(System.in);
         System.out.println("Ingrese la longitud del lado de un cuadrado");
         double l = s1.nextDouble();
         System.out.println("El área del cuadrado es "+(l*l));
     }
 }