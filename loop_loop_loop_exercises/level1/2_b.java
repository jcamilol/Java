//Este código imprime una pirámide de *, donde el usuario ingresa el número de * que van en la base
import java.util.*;
class code{
    public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
    System.out.println("Ingrese la base de la pirámide (Entero impar)");
    int base = s1.nextInt();
    int ii = 1;
    int ee = 0;
        while(ii <= base){
            for(int kk=1; kk<=(base-1)/2-ee; kk++){
                System.out.print(" ");
            }
            ee++;
            for(int jj=1; jj<=ii; jj++){
                System.out.print("*");
            }
        System.out.println();
        ii += 2;
        }   
    ii = base-2;
    ee = (base-1)/2;
        while(ii>=0){
            for(int kk=1; kk<=-(base-3)/2+ee; kk++){
                    System.out.print(" ");
                }
            ee++;
                for(int jj=1; jj<=ii; jj++){
                 System.out.print("*");
                }
        System.out.println();
        ii -= 2;
        } 
    }
}
