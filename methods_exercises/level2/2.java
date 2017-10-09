//Define a method to print the prime factors of a number
class code{
    public static void facp(int n){
    int jj;
        for(int m=1; m<=n; m++){
            jj=0;
            for (int ii=1; ii<=m; ii++){
                    if(m%ii == 0)
                        jj++;
                }
            if(jj==2 && n%m==0)
                System.out.println(m);
        }
    }
    public static void main(String[] args){
        facp(210);
    }
}