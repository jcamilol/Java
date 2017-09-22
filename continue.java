//Este cigo es un ejemplo del uso del continue statement en un ciclo de desición
class code{
    public static void main(String[] args){
        int n = 1; 
        do{
            if(n == 5){
                n += 1;
                continue;
            }
            System.out.println("n = "+n);
            n++;
        }
        while(n < 10);
    }
}