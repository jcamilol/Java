/*Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number os 0.*/
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        int[] A = new int[20];
        for(int ii=0; ii<20; ii++){ //Se leen los datos y se almacenan en el array A
            System.out.println("Entre entero No"+(ii+1));
            A[ii] = s1.nextInt();
        }
        int pos=0, neg=0, par=0, impar=0, cero=0;
        for(int ii=0; ii<20; ii++){
            if(A[ii] > 0) //Si el número en el array es mayor que 0, se aumenta el contador de positivos en 1
                pos++;
            if(A[ii] < 0) //Si el número en el array es menor que 0, se aumenta el contador de negativos en 1
                neg++;
            if(A[ii]%2 == 0) //Si el número en el array es par, se aumenta el contador de pares en 1
                par++;
            if(A[ii]%2 != 0) //Si el número en el array es impar, se aumenta el contador de impares en 1
                impar++;
            if(A[ii] == 0) //Si el número en el array es cero, se aumenta el contador de ceros en 1
                cero++;
        }
        System.out.println("Número de positivos = "+pos);
        System.out.println("Número de negativos = "+neg);
        System.out.println("Número de pares = "+par);
        System.out.println("Número de impares = "+impar);
        System.out.println("Número de ceros = "+cero);
    }
}