//Este código muestra las comparaciones hechas entre strings con el operador ==
class code{
    public static void main(String[] args){
        String S1 = new String("Welcome");
        String S2 = new String("Welcome");
        if(S1 == S2) //Como los objetos tienen el mismo valor pero están alojados en partes distintas de la memoria, se determina que los objetos son diferentes
            System.out.println("Los objetos son iguales");
        else
            System.out.println("Los objetos son diferentes");
    }
}