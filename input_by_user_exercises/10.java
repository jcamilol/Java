//If the marks of Robert in three subjects are entered through keyboard (each out of 100 ), write a program to calculate his average
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese la nota de la primera materia");
        double mat1 = s1.nextDouble();
        System.out.println("Ingrese la nota de la segunda materia");
        double mat2 = s1.nextDouble();
        System.out.println("Ingrese la nota de la tercera materia");
        double mat3 = s1.nextDouble();
        double average = (mat1+mat2+mat3)/3;
        System.out.println("El promedio es "+average);
    }
}