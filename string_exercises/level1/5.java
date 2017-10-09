// Write a program to check if the word 'orange' is present in the "This is orange juice". 
class code{
    public static void main(String[] args){
        String S1 = new String("This is orange juice");
        boolean bool = S1.contains("orange");
        if(bool == true)
            System.out.println("'orange' SÍ está resente en 'This is orange juice'");
        else
            System.out.println("'orange' NO está resente en 'This is orange juice'");
    }
}