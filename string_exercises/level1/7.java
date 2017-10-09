 //Write a program that takes your full name as input and displays the abbreviations of the first and middle names
 //except the last name which is displayed as it is.
 //For example, if your name is Robert Brett Roser, then the output should be R.B.Roser. 
 import java.util.*;
 class code{
     public static void main(String[] args){
         Scanner s1 = new Scanner(System.in);
         System.out.println("Ingrese su nombre completo");
         String S1 = s1.nextLine();
         char pa = S1.charAt(0);
         int esp1 = S1.indexOf(' ');
         char sa = S1.charAt(esp1+1);
         int esp2 = S1.indexOf(' ',esp1+1);
         int l = S1.length();
         String last = S1.substring(esp2+1,l);
         System.out.println(pa+"."+sa+"."+last);
     }
 }