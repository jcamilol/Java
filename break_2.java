//Este código es un ejemplo del uso del break statement en un ciclo de desicións  
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        for(;;){
            System.out.println("*");
            System.out.println("Presione 0 para terminar");
            int x = s1.nextInt();
            if(x == 0)
                break;
        }
    }
}