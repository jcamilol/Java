// Define a program to find out whether a given number is even or odd. 
import java.util.*;
class code{
    public static void par(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre entero");
        int n = s1.nextInt();
        if(n%2 == 0)
            System.out.println(n+" es par");
        else
            System.out.println(n+" es impar");
    }
    public static void main(String[] args){
        par();
    }
}