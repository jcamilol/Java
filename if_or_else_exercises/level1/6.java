// Take input of age of 3 people by user and determine oldest and youngest among them. 
import java.util.*;
class code{
    public static void main(String[] args){
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese la edad de la primera persona");
        int x = s1.nextInt();
        System.out.println("Ingrese la edad de la segunda persona");
        int y = s1.nextInt();
        System.out.println("Ingrese la edad de la tercera persona");        
        int z = s1.nextInt();

        int max = z;    //Definimos cual es la mayor edad
            if(x>max)
                max = x;
            if(y>max)
                max = y;
        
        int min = z;    //Definimos cual es la menor edad
            if(x<min)
                min = x;
            if(y<min)
                min = y;

        System.out.println("La mayor edad es de "+max);
        System.out.println("La menor edad es de "+min);
    }
}