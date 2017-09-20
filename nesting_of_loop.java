//Este código es un ejemplo del uso de un ciclo dentro de otro ciclo, con el cual se imprime la tabla del 12, la del 13 y la del 14
class code{
    public static void main(String[] args){
        for(int m1=12; m1<=14; m1++){ //Se hace un ciclo para cada tabla (12, 13, 14)
            System.out.println("Tabla del "+m1+"\n");
            for(int m2=1; m2<=10; m2++){ //Se multiplica cada m1 (12, 13, 14) con los números del 1 al 10
                System.out.println(m1+"*"+m2+" = "+(m1*m2));
            }
            System.out.println();
        }
    }
}