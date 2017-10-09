//Take 10 integer inputs from user and store them in an array. 
//Again ask user to give a number. Now, tell user whether that number is present in array or not. 
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        int[] A = new int [10];
        for(int ii=0; ii<10; ii++){ //Se leen los datos y se almacenan en el array A
            System.out.println("Entre entero No"+(ii+1));
            A[ii] = s1.nextInt();
        }
        System.out.println("Entre entero para ver si está en el arreglo"); 
        int n = s1.nextInt();
        int jj=0;
        for(int ii=0; ii<10; ii++){ //Se revisa si el número ingresado está en el arreglo
            if(A[ii] == n)
                jj++; //Si está en el arreglo se aumenta el contador en 1
        }
        if(jj>=1) 
            System.out.println(n+" SÍ está en el arreglo");
        else
            System.out.println(n+" NO está en el arreglo");
    }
}