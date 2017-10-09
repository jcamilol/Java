/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.*/
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese el número de años trabajados en la compañía");
        int año = s1.nextInt();
        if(año>5){
            System.out.println("Ingrese el valor de su salario");
            int sal = s1.nextInt();
            System.out.println("Usted aplica para un bono de "+(0.05*sal));
        }
        else{
            System.out.println("Usted no aplica para el bono");
        }
    }
}
