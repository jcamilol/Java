// Modify the above question to allow student to sit if he/she has medical cause. 
//Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly. 
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese el número de clases totales");
        int clase = s1.nextInt();
        System.out.println("Ingrese el número de clases a las que asistió");
        int ast = s1.nextInt();
        System.out.println("El porcentaje de clases asistidas es de "+((ast*100)/clase));
            if(((ast*100)/clase)>=75){
                System.out.println("Usted puede presentar el examen");
            }    
            else{
                System.out.println("¿Tiene usted justificación médica de las fallas (y/n)?");
                String just = s1.next();
                switch(just){
                    case "y":
                        System.out.println("Usted puede presentar el examen");
                        break;
                    case "n":
                        System.out.println("Usted NO puede presentar el examen");
                        break;
                    default:
                        System.out.println("error");
                }
            }
    }
}