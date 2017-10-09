// Write a program to calculate the sum of the first and the second last digit of a 5 digit.
class code{
    public static void main(String[] args){
        int n=34598;
        int dig1=n/10000; //Primer dígito
        n%=10000;
        int dig2=n/1000; //Segundo dígito
        n%=1000;
        int dig3=n/100; //Tercer dígito
        n%=100;
        int dig4=n/10;  //Cuarto dígito
        n%=10;
        int dig5=n; //Quinto dígito
        //System.out.println("dig1 = "+dig1);
        //System.out.println("dig2 = "+dig2);
        //System.out.println("dig3 = "+dig3);
        //System.out.println("dig4 = "+dig4);
        //System.out.println("dig5 = "+dig5);      
        System.out.println("La suma del primer y cuarto dígito es "+(dig1+dig4));
     }
}   