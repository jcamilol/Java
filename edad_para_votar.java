//Este código pide la edad del usuario y determina si este puede votar
import java.util.*;
class code{
    public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
    System.out.println("Ingrese su edad");
    int edad = s1.nextInt();
        if (edad>=18){
            System.out.println("Usted puede votar");
        }   
        else{
            System.out.println("Usted aún no puede votar");
        }
    }
}