// Define a method to calculate power of a number raised to other 
//i.e. a^b using recursion where the numbers 'a' and 'b' are to be entered by the user  
import java.util.*;
class code{
    public static double pow(double a, double b){
        if(b==1)
            return a;
        else
            return a*pow(a,b-1);
    }
    public static void main(String[] ags){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre base");
        double a = s1.nextDouble();
        System.out.println("Entre exponente");
        double b = s1.nextDouble();
        System.out.println(pow(a,b));
    }
}