/*Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.
For example, if the number which was taken is 5696, then the displayed number should be 7818. */
class code{
    public static void main(String[] args){
        int n=6789;

        int dig1=n/1000; //Primer dígito
        n%=1000;
        int dig2=n/100; //Segundo dígito
        n%=100;
        int dig3=n/10; //Tercer dígito
        n%=10;
        int dig4=n; //Cuarto dígito

        //Nuevo número

        int ndig1=(dig1+2)%10; //Primer dígito nuevo número
        int ndig2=(dig2+2)%10; //Segundo dígito nuevo número
        int ndig3=(dig3+2)%10; //Tercer dígito nuevo número
        int ndig4=(dig4+2)%10; //Cuarto dígito nuevo número
        
        System.out.println(ndig1+""+ndig2+""+ndig3+""+ndig4); //Nuevo número
    }
}