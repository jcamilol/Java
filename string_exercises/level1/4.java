// Write a program to check if the letter 'e' is present in the word 'Umbrella'. 
class code{
    public static void main(String[] args){
        String S1 = new String("Umbrella");
        boolean bool = S1.contains("e");
        if(bool == true)
            System.out.println("e SÍ está presente en Umbrella");
        else
            System.out.println("e NO está presente en Umbrella");
    }
}