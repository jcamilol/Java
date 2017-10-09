//Take values of length and breadth of a rectangle from user and check if it is square or not. 
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese el ancho del rectángulo");
        double ancho = s1.nextDouble();
        System.out.println("Ingrese el largo del rectángulo");
        double largo = s1.nextDouble();
        if (ancho == largo){
            System.out.println("El rectángulo es un cuadrado");
        }
        else{
            System.out.println("El rectángulo no es un cuadrado");
        }
    }
}