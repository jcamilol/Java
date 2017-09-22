//Este código es un ejemplo del uso de la creación de un método (función). En este caso para hallar el área de un rectángulo
class code{

    public static void area(int x, int y){
        System.out.println("El área del rectángulo con lado "+x+" y ancho "+y+" es "+x*y);
    }

    public static void main(String[] args){
        area(2,4);
        area(3,9);
        area(5,7);
        area(10,2);
    }
}