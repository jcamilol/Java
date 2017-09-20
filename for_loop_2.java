//Este es un ejemplo del uso del ciclo for, en el que el usuario ingresa 10 números y se imprime la suma de estos
import java.util.*;
class code{
    public static void main(String[] args){
    int n = 0, sum = 0;        
        for(int ii=1; ii<=10; ii++){
            Scanner s1 = new Scanner(System.in);
            System.out.println("Entre entero No."+ii);
            n = s1.nextInt();
            sum += n;
        }
    System.out.println("La suma de los 10 enteros es "+sum);
    }
}