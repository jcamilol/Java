 //Define a method to find out if number is prime or not. 
import java.util.*;
class code{
    public static void primo(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre entero");
        int n = s1.nextInt();
        int jj=0;
        for(int ii=1; ii<=n; ii++){
            if(n%ii == 0)
               jj++;
        }
        if(jj == 2)
            System.out.println(n+" es primo");
        else
            System.out.println(n+" NO es primo");
    }
    public static void main(String[] args){
        primo();
    }   
 }