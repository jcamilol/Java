//Write a program to find prime factor of a number.
//If a factor of a number is prime number then it is its prime factor.
class code{
    public static void main(String[] args){
    int m=10;
    System.out.println("Los factores primos de "+m+" son");
        for(int n=2; n<=m; n++){
            int cc = 0;
            for(int ii=1; ii<=n; ii++){
                if(n%ii == 0)
                    cc++;
            }
        if(cc<=2){
            if(m%n == 0)
                System.out.println(n);
            }
        }
    }
}
