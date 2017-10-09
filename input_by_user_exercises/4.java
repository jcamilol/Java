/*Take name, roll number and field of interest from user and print in the format below :
Hey, my name is xyz and my roll number is xyz. My field of interest are xyz. */
import java.util.*;
class code{
    public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
    System.out.println("Ingrese su nombre");
    String name = s1.nextLine();
    System.out.println("Ingrese su número de la suerte");
    int number = s1.nextInt();
    System.out.println("Ingrese sus campos de interés");
    s1.next();
    String interes = s1.nextLine();
    System.out.println("Hey, my name is "+name+" and my roll number is "+number+". My field of interest are "+interes);
    }
}