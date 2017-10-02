//Este código muestra las comparaciones hechas entre strings con el operador ==
class code{
    public static void main(String[] args){
        String S1 = new String("Welcome");
        String S2 = S1;
        if(S1 == S2) // Ya que al crear S2 se le asigna el mismo valor y espacio de memoria que a S1, se determina que los dos objetos son iguales
            System.out.println("Los objetos son iguales");
        else
            System.out.println("Los objetos son diferentes");
    }
}