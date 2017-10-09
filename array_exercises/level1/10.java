//Consider an integer array, the number of elements in which is determined by the user.
//The elements are also taken as input from the user.
//Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs. 
import java.util.*;
import java.lang.*;
class code{
    public static void maxdif(int[] A){ //Función que determina la máxima diferencia entre cualesquiera pares de elementos de un array
        int max = A[0];
            for(int ii=1; ii<A.length; ii++){
                if(A[ii]>max)
                    max = A[ii];
            }
        int min = A[0];
            for(int ii=1; ii<A.length; ii++){
                if(A[ii]<min)
                    min = A[ii];
            }
        int difmax = Math.abs(max-min); //La máxima diferencia entre los pares de elementos está determinada por la diferencia ente el mayor y el menor elemento en el arreglo
        System.out.println("Diferencia máxima = "+difmax); 
    }
    public static void mindif(int[] A){ //Función que determina la mínima diferencia entre cualesquiera pares de elementos de un array
        int difmin = Math.abs(A[0]-A[1]) ;
            for(int ii=0; ii<A.length; ii++){
                for(int jj=0; jj<A.length; jj++){
                    if(ii != jj){ //Suponemos que son dos pares distintos (No son el mismo index del array)
                        if(Math.abs(A[ii]-A[jj])<difmin)
                            difmin = Math.abs(A[ii]-A[jj]);
                    }
                }
            }
            System.out.println("Diferencia mínima = "+difmin);
    }
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre el tamaño del arreglo (Mayor o igual a 2)");
        int length = s1.nextInt();
        int[] A = new int [length];
        for(int ii=0; ii<(A.length); ii++){
            System.out.println("Entre entero No"+(ii+1));
            A[ii] = s1.nextInt();
        }
        //maxdif(A);
        mindif(A);
    }
}