//Este código es un ejemplo del uso de un método de la clase String (contains(characterSequence t))
import java.lang.String;
class code{
    public static void main(String[] args){
        String S1 = "Mi nombre es : Godel";
        boolean bool1 = S1.contains("Godel");
        boolean bool2 = S1.contains(":");
        boolean bool3 = S1.contains("nmr");
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);
    }
}