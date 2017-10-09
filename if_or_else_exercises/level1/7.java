/*Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1*/
import java.util.*;
class code{
    public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
    System.out.println("Entre número entero");
    int n = s1.nextInt();
        if(n>=0){
            System.out.println("El valor absoluto de "+n+" es "+n);
        }
        else{
            System.out.println("El valor absoluto de "+n+" es "+(-n));
        }
    }
}