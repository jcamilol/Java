/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese el número de clases totales");
        int clase = s1.nextInt();
        System.out.println("Ingrese el número de clases a las que asistió");
        int ast = s1.nextInt();
        System.out.println("El porcentaje de clases asistidas es de "+((ast*100)/clase));
            if(((ast*100)/clase)>=75)
                System.out.println("Usted puede presentar el examen");
            else
                System.out.println("Usted NO puede presentar el examen");
    }
}