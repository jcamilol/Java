//Este método es un ejemplo del uso de dos métodos de la clase String (substring(int startIndex) y substring(int startIndex, int endIndex))
import java.lang.String;
class code{
    public static void main(String[] args){
        String S = "camaleón";
        String S1 = S.substring(4); //Este método retorna un substring iniciando desde el index 4 del string S
        String S2 = S.substring(0,4); //Este método retorna un substring iniciando desde el index 0 y terminando en el index 3 del string S
        System.out.println(S1);
        System.out.println(S2);
    }
}