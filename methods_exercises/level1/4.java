// Define two methods to print the maximum and the minimum number respectively among three numbers entered by user. 
import java.util.*;
class code{
    public static void max(double x, double y, double z){
        double max = z;
        if(x>max)
            max = x;
        if(y>max)
            max = y;
        System.out.println("El máximo es "+max);
    }
    public static void min(double x, double y, double z){
        double min = z;
        if(x<min)
            min = x;
        if(y<min)
            min = y;
        System.out.println("El mínimo es "+min);
    }
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Entre número");
        double x = s1.nextDouble();
        System.out.println("Entre número");
        double y = s1.nextDouble();
        System.out.println("Entre número");
        double z = s1.nextDouble();
        max(x,y,z);
        min(x,y,z);
    }
}