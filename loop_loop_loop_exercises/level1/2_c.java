/*Print the following patterns using loop :
c.
1010101
 10101 
  101  
   1*/
import java.util.*;
class code{
    public static void main(String[] args){
    Scanner s1 = new  Scanner(System.in);
    System.out.println("Ingrese la base de la pirámide (Entero impar)");
    int base = s1.nextInt();
    int dd = 0;
    int ii, ee, jj=0;
    for (dd=0; base-dd>=1; dd=dd+2){    
        for(ee=0; ee<jj; ee++){
            System.out.print(" ");
        }
        jj++;
        for(ii=1; ii<=base-dd; ii++ ){
            if(ii%2 != 0)
                System.out.print("1");
            else
                System.out.print("0");
            }
    System.out.println();
        }
    }
}