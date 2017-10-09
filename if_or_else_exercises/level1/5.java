/*A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.*/
import java.util.*;
class code {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese su calificación");
        double nota = s1.nextDouble();
            if(nota>=80){
                System.out.println("grado A");
            }
            else if(nota<80 && nota>=60){
                System.out.println("grado B");
            }
            else if(nota<60 && nota>=50){
                System.out.println("grado C");
            }
            else if(nota<50 && nota>=45){
                System.out.println("grado D");
            }
            else if(nota<45 && nota>=25){
                System.out.println("grado E");
            }
            else if(nota<25){
                System.out.println("grado F");
            }
            else{
                System.out.println("Calificación no válida");
            }
    }
}   