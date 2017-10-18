//Este código muestra como crear un array de objetos, en este caso objetos "Car" que almacenan la potencia y el serial de un auto
class Car{
    public int power;
    public int serial_no;
    public Car(int p, int s){ //Método constructor
        power = p;
        serial_no = s;
    }
}
class main{
    public static void main(String[] args){
        Car[] c = new Car[10]; //Creamos un array de objetos Car con nombre c, con tamaño de 10 elementos
        c[0] = new Car(800,111); //Se define el objeto Car con index 0, potencia 800 y serial_no 111
    }
}