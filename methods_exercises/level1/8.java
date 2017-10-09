/* Write a program which will ask the user to enter his/her marks (out of 100). 
Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail */
import java.util.*;
class code{
    public static void mark(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter marks");
        int m = s1.nextInt();
        if(m>=91 && m<=100)
            System.out.println("AA");
        else if(m>=81 && m<91)
            System.out.println("AB");
        else if(m>=71 && m<81)
            System.out.println("BB");
        else if(m>=61 && m<71)
            System.out.println("BC");
        else if(m>=51 && m<61)
            System.out.println("CD");
        else if(m>=41 && m<51)
            System.out.println("DD");
        else if(m<=40)
            System.out.println("Fail");
        }
    public static void main(String[] args){
        mark();
    }
}
