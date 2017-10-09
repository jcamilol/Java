/*Using recursion, define a method to know nth term of a Fibonacci series.
Nth term of Fibonacci series is
F(n) = F(n-1)+(n-2)
F(0) = 0
F(1) = 1
F(2) = F(1)+(0) = 1+0 = 1
F(3) = F(2)+(1) = 1+1 = 2
F(4) = F(3)+(2) = 2+1 = 3*/
class code{
    public static int fib(int n){
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else 
            return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
            System.out.println(fib(7));
        }
    }
}