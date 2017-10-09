//Write a program to find out the largest and smallest word in the string "This is an umbrella". 
class code{
    public static void large(String str){
        String sub, maysub = new String(""), mensub = new String("");
        int len = str.length(), cont=0, maylen=0, menlen=2147483647;
        for(int ii=0; ii<len; ii++){
            char charac = str.charAt(ii);
            if(charac == ' ' || ii == len-1){
                sub = str.substring(cont,ii+1);
                int sublen = sub.length();
                cont = ii+1;
                if(sublen>maylen){
                    maysub = sub;
                    maylen = sublen;
                }
                if(sublen<menlen){
                    mensub = sub;
                    menlen = sublen;
                }
            } 
        }
        System.out.println("Palabra más grande = "+maysub); //Por defecto, solo se imprime una palabra como mayor
        System.out.println("Palabra más pequeña = "+mensub); //Por defecto solo se imprime una palabra como menor
    }
    public static void main(String[] args){
        String str = new String("This is an umbrella");
        large(str);
    }
}
