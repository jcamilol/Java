//Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. 
import java.util.*;
class code{
    public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
    System.out.println("Entre el ancho de un rectángulo");
    double ancho = s1.nextDouble();
    System.out.println("Entre el largo de un rectángulo");
    double largo = s1.nextDouble();
    double area = ancho*largo;
    System.out.println("El área del rectángulo es "+((int)area));
    }
}