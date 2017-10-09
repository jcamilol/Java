// Take 10 integers from keyboard using loop and print their average value on the screen. 
import java.util.*;
class code{
    public static void main(String[] args){
    int ii = 1, sum = 0;    
        while(ii<=10){
            Scanner s1 = new Scanner(System.in);
            System.out.println("Entre entero No "+ii);
            int n = s1.nextInt();
            sum += n;
            ii++;  
        }
    System.out.println("El promedio de los 10 números es "+(sum/10.0));
    }
}