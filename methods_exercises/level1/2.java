// Define a method that returns the product of two numbers entered by user. 
import java.util.*;
class code{
    public static void mult(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre un número");
        double x = s1.nextDouble();
        System.out.println("Entre un número");
        double y = s1.nextDouble();
        System.out.println(x+"*"+y+" = "+(x*y));
    }
    public static void main(String[] args){
        mult();
    }
}