//Este código determina el mayor de tres enteros ingresados por el usuario usando el else if statement
import java.util.*;
class code{
    public static void main(String[] args){
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre el primer entero");
        int x = s1.nextInt();
        System.out.println("Entre el segundo entero");
        int y = s1.nextInt();
        System.out.println("Entre el tercer entero");
        int z = s1.nextInt();

        if ((x>y) && (x>z)){
            System.out.println(x+" es el mayor");
        }
        else if ((y>x) && (y>z)){
            System.out.println(y+" es el mayor");
        }
        else if ((z>x) && (z>y)){
            System.out.println(z+" es el mayor");
        }
    }
}