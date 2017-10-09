// Write a program to print all prime number in between 1 to 100. 
class code{
    public static void main(String[] args){
        for(int n=2; n<=100; n++){
            int cc = 0;
            for(int ii=1; ii<=n; ii++){
                if(n%ii == 0)
                    cc++;
            }
        if(cc<=2)
            System.out.println(n);
        }
    }
}