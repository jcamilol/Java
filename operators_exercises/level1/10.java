/*Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
1 - first program by using a third variable
2 - second program without using any third variable
( Swapping means interchanging the values of the two variables E.g.- If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.) */

//This is the second program

class code{
    public static void main(String[] args){
        int a=6, b=8;
        b=b-a;
        a=b+a;
        b=-(b-a);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}