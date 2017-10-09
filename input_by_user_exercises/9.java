// Write a program to enter the values of two variables 'a' and 'b' from keyboard and then check if both the conditions 'a < 50' and 'a < b' are true. 
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese entero a");
        int a = s1.nextInt();
        System.out.println("Ingrese entrero b");
        int b = s1.nextInt();
        boolean bool = (a<50) && (a<b);
        System.out.println("(a<50) && (a<b) = "+bool);
    }
}