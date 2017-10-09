// Take 10 integer inputs from user and store them in an array and print them on screen. 
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        int[] A = new int[10];
        
        for(int ii=0; ii<10; ii++){ //Se leen los datos y se almacenan en el array A
            System.out.println("Entre entero No "+(ii+1));
            A[ii] = s1.nextInt();
        }

        System.out.println("Los enteros del arreglo son:");
        for(int ii=0; ii<10; ii++){ //Se imprimen los datos del array A 
            System.out.println(A[ii]);
        }

    }
}