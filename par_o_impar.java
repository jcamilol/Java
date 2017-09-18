//Este código determina si un número ingresado por el usuario es par o impar
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre entero");
        int n = s1.nextInt();
        if((n%2)==0){
            System.out.println(n+" es par");
        }
        else{
            System.out.println(n+" es impar");
        }
    }
}