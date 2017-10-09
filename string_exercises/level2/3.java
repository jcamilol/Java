//Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order. 
import java.util.*; 
class code{
    public static void orden(String[] A){
        int len = A.length;
        String temp;
        for(int cont=0; cont<len; cont++){
            for(int ii=cont+1; ii<len; ii++){
                if(A[ii].charAt(0)<A[cont].charAt(0)){
                    temp = A[ii];
                    A[ii] = A[cont];
                    A[cont] = temp;
                }
                else if(A[ii].charAt(0)==A[cont].charAt(0)){
                    if(A[ii].charAt(1)<A[cont].charAt(1)){
                        temp = A[ii];
                        A[ii] = A[cont];
                        A[cont] = temp;
                    }
                }
            }
        }
        System.out.println("\n////////////////////////////////////////\nNombres en orden alfabético ascendente\n////////////////////////////////////////\n");
        for(int ii=0; ii<len; ii++){
            System.out.println(A[ii]);
        }
    }
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        String[] nombres = new String [10];
        for(int ii=0; ii<10; ii++){
            System.out.println("Entre nombre No."+(ii+1));
            nombres[ii] = s1.next();
        }
        orden(nombres);
    }
}