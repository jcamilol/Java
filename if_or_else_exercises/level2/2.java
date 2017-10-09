/*Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere
if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
And any other input of age should print "ERROR".*/
import java.util.*;
class code{
    public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
    System.out.println("Ingrese su edad");
    int age = s1.nextInt();
    System.out.println("Sexo (m/f)");
    char sex = s1.next().charAt(0);
    System.out.println("Casado (y/n)");
    char stus = s1.next().charAt(0);
        if(sex == 'f')
            System.out.println("Usted sólo puede trabajar en áreas urbanas");
        if(sex == 'm'){
            if(age>=20 && age<40)
                System.out.println("Usted puede trabajar en cualquier área");
            else if(age>=40 && age<=60)
                System.out.println("Usted sólo puede trabajar en áreas urbanas");
            else 
                System.out.println("ERROR");
        }
    }
}