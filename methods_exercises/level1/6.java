 //A person is elligible to vote if his/her age is greater than or equal to 18. 
 //Define a method to find out if he/she is elligible to vote. 
 import java.util.*;
 class code{
    public static void votar(){
         Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = s1.nextInt();
        if(edad>=18)
            System.out.println("Usted puede votar");
        else 
            System.out.println("Usted no puede votar");
    }
    public static void main(String[] args){
        votar();
    }
 }