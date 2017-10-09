//Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World". 
class code{
    public static void main(String[] args){
        String S1 = new String("Hello, World");
        int n1 = S1.indexOf('o');
        int n2 = S1.indexOf('o',5);
        int n3 = S1.indexOf(",");
        System.out.println("n1 = "+n1);
        System.out.println("n2 = "+n2);
        System.out.println("n3 = "+n3);
    }
}