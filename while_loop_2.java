//Este programa es un ejemplo del ciclo while, en el cual se determina si un número ingresado por teclado es par o impar, y se le pregunta al usuario si quiere evaluar más números
import java.util.*;
class code{
    public static void main(String[] args){
    int yn = 1;     
        while (yn == 1){
            Scanner s1 = new Scanner(System.in);
            System.out.println("Entre entero para determinar su paridad");
            int n = s1.nextInt();
                if (n%2 == 0)
                    System.out.println(n+" es par");
                else 
                    System.out.println(n+" es impar");
            System.out.println("¿Quiere evaluar la paridad de otro número? (y=1/n=0)");
            yn = s1.nextInt();
        }
    System.out.println("Espero que hallas revisado todos tus números");
    }
}