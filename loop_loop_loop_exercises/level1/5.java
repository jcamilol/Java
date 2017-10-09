//Write a Java program to calculate factorial of a number. 
class code{
    public static void main(String[] args){
    int fac = 1;
    int n = 0;
    if(n == 0)
        System.out.println("0! = 0");
    else{       
        for(int ii=1; ii<=n; ii++){
            fac*=ii;
        }
    }    
    System.out.println(n+"! = "+fac);
    }
}