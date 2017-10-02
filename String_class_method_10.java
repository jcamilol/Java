//Este código es un ejemplo del uso de un método de la clase String (equals(object anotherObject))
import java.lang.String;
class code{
    public static void main(String[] args){
        String S1 = new String("Welcome");
        String S2 = new String("Welcome");
        if(S1.equals(S2)) // Este método compara dos objetos, y si su contenido es igual, determina si son iguales (sin importar su espacio en la memoria)
            System.out.println("Los objetos son iguales");
        else
            System.out.println("Los objetos son diferentes");
    }
}