//Este código muestra como funciona el manejo de una clase y sus objetos cuando la clase tiene un método constructor con parámetros
class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(int l, int b){ //Método constructor con parámetros l y b
        length = l;
        breadth = b;
    }
    public int getArea(){
        return length*breadth;
    }
}
class code{
    public static void main(String[] args){
        Rectangle r = new Rectangle(2,4); //Objeto r de la clase Rectangle
        System.out.println(r.getArea());
    }
}