// Take 10 integer inputs from user and store them in an array.
//Now, copy all the elements in an another array but in reverse order. 
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        int[] A = new int [10];
        for(int ii=0; ii<10; ii++){ //Se leen los datos y se almacenan en el array A
            System.out.println("Entre entero No"+(ii+1));
            A[ii] = s1.nextInt();
        }
        int[] B = new int[10];
        int jj=9;
        for(int ii=0; ii<10; ii++){
            B[ii] = A[jj]; //El primer elemento de B corresponde con el último del A, y así sucesivamente
            jj--;
        }
        System.out.println("\nNuevo array:\n");
        for(int ii=0; ii<10; ii++){ //Imprimimes el array B
            System.out.println(B[ii]);
        }
    }
}