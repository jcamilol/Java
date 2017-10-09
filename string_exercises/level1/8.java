//Write a program to find the number of vowels, consonents, digits and white space characters in a string. 
import java.lang.String;
class code{
    public static void conteo(String str){
        int length = str.length();
        String str2 = str.toLowerCase();
        int ii=0, jj=0, kk=0, ll=0;
        for(int nn=0; nn<length; nn++){
            char ch = str2.charAt(nn);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                ii++;
            else if(ch>='a' && ch<='z')
                jj++;
            else if(ch>='0' && ch<='9')
                kk++;
            else if(ch == ' ')
                ll++;
        }
        System.out.println("vocales = "+ii);
        System.out.println("consonantes = "+jj);
        System.out.println("digitos = "+kk);
        System.out.println("espacio = "+ll);
    }
    public static void main(String[] args){
        String S1 = new String("BuuzV7dXIM");
        conteo(S1);
    }
}