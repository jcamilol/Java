/*Take two different string input and print them in same line. E.g.-
INPUT : Codes
Dope
OUTPUT : CodesDope */
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String p1 = s1.next();
        System.out.println("Ingrese una palabra");
        String p2 = s1.next();
        System.out.println(p1+p2);
        }
}