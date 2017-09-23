//Este código es un ejemplo de como llamar un método en otro método
class code{
    public static int div2(int x){
        if(x%2 == 0)
            return 1;
        else
            return 0;
    }
    public static void div6(int x){
        if(div2(x)==1 && x%3 == 0)
            System.out.println(x+" es divisible por 6");
        else
            System.out.println(x+" no es divisible por 6");
    }
    public static void main(String[] args){
        div6(24);
        div6(23);
    }
}