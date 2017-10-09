// Print ASCII values and their equivalent characters. ASCII value vary from 0 to 255. 
class code{
    public static void main(String[] args){
        for(int ii=0; ii<=255; ii++){
            char ASCII = (char)ii;
            System.out.println(ii+" = "+ASCII);
        }
    }
}