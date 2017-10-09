// Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). 
//Print average and product of all numbers. 
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        int jj = 1, sum=0;
        char cont = 'd';
        while (cont != 'q'){
            System.out.println("Entre entero No"+jj);
            int ii = s1.nextInt();
            sum+=ii;
            jj++;
            System.out.println("Presione q para salir, d para continuar");
            cont = s1.next().charAt(0);
            }
            jj--;
        System.out.println("El promedio de los "+jj+" números es "+(sum/jj));
    }
}