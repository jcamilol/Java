//Este código es un ejemplo de como crear un método propio. En este caso se usa un método para evaluar la paridad de un número ingresado por el usuario
import java.util.*;
class code{

    public static void paridad(){
        int choice = 1;
        int x;
            while (choice == 1){
                System.out.println("Entre entero");
                Scanner s1 = new Scanner(System.in);
                x = s1.nextInt();
                    if(x%2 == 0)
                        System.out.println(x+" es par");
                    else
                        System.out.println(x+" es impar");
                System.out.println("Para evaluar otro entero presione 1, para salir presione 0");
                choice = s1.nextInt(); 
                }
    }

    public static void main(String[] args){
        paridad();
    }
}         