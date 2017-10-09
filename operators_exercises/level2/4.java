 /*Write a program to reverse a 3-digit number. E.g.-Number : 132   Output : 231 */
 class code{
     public static void main(String[] args){
         int n=132;

        int dig1=n/100; //Primer dígito
        n%=100;
        int dig2=n/10; //Segundo dígito
        n%=10;
        int dig3=n; //Tercer dígito

        System.out.println(dig3+""+dig2+""+dig1);
     }
 } 