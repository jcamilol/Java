import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = s1.next();
        System.out.println("Ingrese su apellido");
        String lastname = s1.next();
        System.out.println("Su nombre completo es "+name+" "+lastname);
    }
}