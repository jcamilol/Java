//Este código muestra como leer datos de un array
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        int[] z = new int[10];
        System.out.println("Entre 10 enteros de un array");
            for(int ii=0; ii<10; ii++)
                z[ii] = s1.nextInt();
        System.out.println("Usted ingresó");
            for(int ii=0; ii<10; ii++)
                System.out.println(z[ii]);
    }
}