// Write a program to reverse individual words in a string,
//where each word may be delimited by a dot, comma, space or tab, like www.google.com should become www.elgoog.moc.
class code{
    public static void voltear(String str){
        str = str+' '; //Agregamos un espacio al final para poder trabajar la última palabra cómodamente
        char[] reves = new char [str.length()];
        int control = 0;
        for(int ii=0; ii<str.length(); ii++){
            char ch = str.charAt(ii);
            if(ch == '.' || ch == ',' || ch == ' '){
                reves[ii] = str.charAt(ii);
                int jj;
                int temp = control; 
                for(jj=ii-1; jj>=temp; jj--){
                    reves[jj] = str.charAt(control);
                    control++;
                }
                control = ii+1;
            }
        }
        for(int ii=0; ii<str.length(); ii++){
            System.out.print(reves[ii]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        voltear("www.google.com");
        voltear("saturno es un planeta muy bonito");
    }
}