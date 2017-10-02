//Este código es un ejemplo del uso de cuatro metodos de la clase String (indexOf(char ch), indexOf(char ch, int startIndex), indexOf(string substring), indexOf(string substring, int startIndex))
import java.lang.String;
class code{
    public static void main(String[] args){
        String S1 = "Switch on the button";
        int n1 = S1.indexOf('o'); //Este método retorna el entero al que está indexado el char 'o', por defecto el menor de los enteros indexados
        int n2 = S1.indexOf('o', 8); //Este método retorna el entero al que está indexado el char 'o' (el menor de los enteros indexados luego del index 8)
        int n3 = S1.indexOf("on"); //Este método retorna el entero indexado al substring "on", por defecto el menor de los enteros indexados
        int n4 = S1.indexOf("on", 8); //Este método retorna el entero indexado al substring "on" (el menor de los enteros indexados luego del index 8)
        System.out.println("n1 = "+n1);
        System.out.println("n2 = "+n2);
        System.out.println("n3 = "+n3);
        System.out.println("n4 = "+n4);
    }
}