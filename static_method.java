//Este código muestra como usar un método "static"
class Rectangle{
    public static void printArea(int l, int b){
        System.out.println(l*b);
    }
}
class code{
    public static void main(String[] args){
        Rectangle.printArea(2,5);
    }
}