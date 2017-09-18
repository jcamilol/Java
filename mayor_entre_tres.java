//Este código determina cual es el mayor de tres números
class code{
    public static void main(String[] args){
        int x=-12, y=12, z=0;
        int max = x;
        if (y>max)
            max=y;
        if (z>max)
            max=z;
        System.out.println("El mayor es "+max);           
    }
}