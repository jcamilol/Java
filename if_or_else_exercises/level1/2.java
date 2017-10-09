// Take two int values from user and print greatest among them. 
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre entero");
        int a = s1.nextInt();
        System.out.println("Entre entero");
        int b = s1.nextInt();
        if (a<b){
            System.out.println("El más grande es "+b);
        }
        else {
            System.out.println("El más grande es "+a);
        }
    }
}