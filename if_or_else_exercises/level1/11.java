// Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ). 
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese un caracter");
        char ch = s1.next().charAt(0); //Permite ingresar variable de tipo char
            if (ch>=65 && ch<=90)
                System.out.println("El caracter está en mayúsucula");
            else
                System.out.println("El caracter está en minúscula");
    }
}