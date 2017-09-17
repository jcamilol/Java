import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre el largo de un rectángulo");
        Double largo = s1.nextDouble();
        System.out.println("Entre el ancho de un rectángulo");
        Double ancho = s1.nextDouble();
        System.out.println("El área del rectángulo es "+(largo*ancho));
    }
}