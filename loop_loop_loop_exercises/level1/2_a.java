/*Print the following patterns using loop :
a.
*
**
***
****
*/
import java.util.*;
class code{
    public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
    System.out.println("Ingrese la base del triángulo");    
    int base = s1.nextInt();
        for(int zz=1; zz<=base; zz++){
            for(int yy=1; yy<=(zz); yy++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}