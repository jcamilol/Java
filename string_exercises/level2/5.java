 //Input a string which contains some palindrome substrings.
 //Find out the position of palindrome substrings if exist and replace it by *. 
 //(For example if input string is “bob has a radar plane” then it should convert in “*** has a ***** plane”. 
class code{
    public static void fun(String str){
        str = str+' '; //Para poder calcular correcta y fácilmente la última palabra, le agregamos un espacio al final
        int len = str.length(), cont = 0;
        for(int ii=0; ii<len; ii++){
            char ch = str.charAt(ii);
            if(ch == ' '){ //Si se encuentra un espacio en la frase, se define un substring con la palabra
                String sub = str.substring(cont,ii);
                int sublen = sub.length();
                int kk = sublen-1;
                boolean bool = true;
                for(int jj=0; jj<sublen; jj++){ //Se itera para buscar si la palabra es palíndromo
                    char inf = sub.charAt(jj);
                    char sup = sub.charAt(kk);
                    if(inf != sup) 
                       bool = false;
                    kk--;
                }
                if(bool == true){ //Si la palabra es palíndromo, la reemplaza con asteriscos y se cambia en el string (frase) 
                    for(int mm=0; mm<sublen; mm++){
                        sub = sub.replace(sub.charAt(mm),'*');
                    }
                str = str.substring(0,cont)+sub+str.substring(ii,str.length());
                }
                cont = ii+1; //Si se encuentra un espacio se modifica el punto de control
            }
        }
        System.out.println(str); //Se imprime el string (frase) con los cambios realizados 
    }
    public static void main(String[] args){
        String str = new String("bob has a radar plane");
        fun(str);
        String str1 = new String("12345 12321 0011 432 4443444");
        fun(str1);
    }
}