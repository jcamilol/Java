//Este código es un ejemplo del uso de un método de la clase String (replaceAll(String old subString, String new subString))
import java.lang.String;
class code{
    public static void main(String[] args){
        String S1 = "replica de revista restaurada";
        String S2 = S1.replaceAll("re","su"); //Este método retorna un nuevo string donde se remplaza el  subString "re" del string S1 con el subString "su"
        System.out.println(S2);
    }
}