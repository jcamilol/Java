// Write a program to print the sum of two numbers entered by user by defining your own method. 
import java.util.*;
class code{

    public static void suma(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre entero");
        int x = s1.nextInt();
        System.out.println("Entre entero");
        int y = s1.nextInt();
        System.out.println(x+"+"+y+" = "+(x+y));
    }

    public static void main(String[] args){
        suma();
    }
}