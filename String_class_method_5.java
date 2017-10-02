//Este código es un ejemplo del uso de un método de la clase String (replace(char oldChar, char newChar))
import java.lang.String;
class code{
    public static void main(String[] args){
        String S1 = "Godel perro bigoton";
        String S2 = S1.replace('o','&'); //Este método retorna un nuevo array, reemplazando el char 'o' con el char '&' en el string S1
        System.out.println(S2);
    }
}