//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. 
import java.util.*;
class code{
    static final double PI = 3.14159265358979323846;
    public static void circ(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo");
        double r = s1.nextDouble();
        System.out.println("Cricunferencia = "+(2*PI*r));
        System.out.println("Área = "+(PI*r*r));
    }
    public static void main(String[] args){
        circ();
    }
}