//Write a program to check if a given string is a Palindrome.
//A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc. 
class code{
    public static void pali(String str){
        int len = str.length();
        int jj = len-1;
        boolean bool = true;
        for(int ii = 0; ii<len; ii++){
            char chi = str.charAt(ii);
            char chf = str.charAt(jj);
            if(chi != chf)
                bool = false;  
            jj--;
        }
        if(bool == true)
            System.out.println("La palabra SÍ es un palíndromo");
        else
            System.out.println("La palabra NO es un palíndromo");
    }
    public static void main(String[] args){
        String str = new String("abcdcba");
        String str2 = new String("abcdcbe");
        pali(str);
        pali(str2);
    }
}