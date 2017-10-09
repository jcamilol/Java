/*Este código imprimer un rombo de kek, donde el usuario determina el número de escalones de la siguiente manera:
INPUT:3  OUTPUT: k          INPUT:8     OUTPUT: k
                kek                            kek
               kekek                          kekek
                kek                          kekekek
                 k                          kekekekek
                                           kekekekekek
                                          kekekekekekek
                                         kekekekekekekek
                                          kekekekekekek
                                           kekekekekek
                                            kekekekek
                                             kekekek
                                              kekek
                                               kek
                                               k*/
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Introduce el número");
        int esc = s1.nextInt();
        int jj=1,m=0;
        int base = (esc*2)-1;
            
            while (jj<=base){ //Mitad superior del rombo
                for(int kk=1; kk<=(base-1)/2-m; kk++){//Se imprimen los espacios de un renglón
                    System.out.print(" ");
                }
                m++;
                for(int ii=1; ii<=jj; ii++){ //Se imprimen los kek de un renglón
                    if(ii%2 != 0)
                        System.out.print("k");
                    else
                        System.out.print("e");
                }
            jj+=2;
            System.out.println();    
            }
    
            m=1;
            while((base-2*m)>0){ //Mitad inferior del rombo
                for(int ii=1; ii<=m; ii++){ //Se imprimen los espacios de un renglón
                    System.out.print(" ");
                }
                for(jj=1; jj<=(base-2*m); jj++){ //Se imprimen los kek de un renglón
                    if(jj%2 != 0)
                        System.out.print("k");
                    else    
                        System.out.print("e");    
                }
                System.out.println();
                m++;
            }
    }
}

