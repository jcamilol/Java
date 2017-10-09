/*Take 3 inputs from user and check :
all are equal
any of two are equal
( use && || )*/
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese número entero");
        int a = s1.nextInt();
        System.out.println("Ingrese número entero");
        int b = s1.nextInt();
        System.out.println("Ingrese número entero");
        int c = s1.nextInt();
        boolean first = (a==b) && (b==c) && (a==c);
        boolean second = (a==b) || (b==c) || (a==c);
        boolean thirth = !(second);
        System.out.println("¿Los tres números son iguales?: "+first);
        System.out.println("¿Hay dos números iguales?: "+second);
        System.out.println("¿No hay números iguales?: "+thirth);
    }
}