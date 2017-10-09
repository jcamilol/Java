/*Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also,
1! = 1
0! = 0 */
class code{
    public static int fact(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else 
            return fact(n-1)*n;
    }
    public static void main(String[] args){
        System.out.println(fact(7));
    }
}