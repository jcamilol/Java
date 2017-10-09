// Write a program to replace a given substring in a sentence with another string.
//For example, in the sentence,
//”A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”.
class code{
    public static void replace(String frase, String oldString, String newString){
        int fraselen = frase.length();
        for(int ii=0; ii<fraselen; ii++){
            if(frase.charAt(ii) == oldString.charAt(0)){ //Si alguna letra de la frase empata con la primera letra de la palara a reemplazar
                int jj = ii;
                boolean bool = true;
                for(int kk=0; kk<oldString.length(); kk++){
                    if(frase.charAt(jj) != oldString.charAt(kk)){
                        bool = false;
                    }
                    jj++;
                }
                if(bool == true){ //Si se encontró la palabra a cambiar en la frase
                    frase = frase.substring(0,ii)+newString+frase.substring(jj);
                }
            }
            fraselen = frase.length();
        }
        System.out.println(frase);
    }
    public static void main(String[] args){
        String frase = new String("A batman with bat");
        String oldString = new String("bat");
        String newString = new String("snow");
        replace(frase, oldString, newString);
        replace("vaca con fiebre vacaloca", "vaca", "rata");
    }
}