//Este código es un ejemplo del uso de dos métodos de la clase String (toLowerCase() y toUpperCase())
import java.lang.String;
class code{
    public static void main(String[] args){
        String S = "Esta es una linea de código";
        String S1 = S.toLowerCase(); //Este método retorna un nuevo array que es igual al array S, pero con todas sus letras en minúscula
        String S2 = S.toUpperCase(); //Este método retorna un nuevo array que es igual al array S, pero con todas sus letras en mayúscula
        System.out.println("String en minúscula = "+S1);
        System.out.println("String en mayúscula = "+S2);
    }
}