/*Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6 */
class code{
    public static void main(String[] args){
        int n=132;

        int dig1=n/100; //Primer dígito
        n%=100;
        int dig2=n/10; //Segundo dígito
        n%=10;
        int dig3=n; //Tercer dígito

        System.out.println(dig1+dig2+dig3);        
    }
}