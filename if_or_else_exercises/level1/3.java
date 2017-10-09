/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese el número de productos comprados");
        int pros = s1.nextInt();
        int costo = pros*100;
        if(costo>1000){
            System.out.println("Precio total = "+(costo-(0.1*costo)));
        }
        else{
            System.out.println("Precio total = "+costo);
        }
    }
}