//Este código es un ejemplo sencillo del uso de un metodo que retorna algo, en este caso un producto
class code{
    public static double area(double x, double y){
        return x*y;
    }
    public static void main(String[] args){
        double z = area(12.35,13.13);
        System.out.println(z);
    }
}