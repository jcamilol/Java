//This is an example of the use of a 2D array (matrix), in which we take input by user the marks of 3 students in two differents subjects, and then we display it in console
//We will suppose that the marks are given in ints
import java.util.*;
class code{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        int[][] A = new int[3][2];
            for(int jj=0; jj<2; jj++){ //Se almacenan los datos
                for(int ii=0; ii<3; ii++){
                    System.out.println("Entre materia "+(ii+1)+" del estudiante "+(jj+1));
                    A[ii][jj] = s1.nextInt();
                }
            }
            for(int jj=0; jj<2; jj++){
                for(int ii=0; ii<3; ii++){ //Se imprimen los datos
                    System.out.println("Estudiante "+(jj+1)+", materia "+(ii+1));
                    System.out.println(A[ii][jj]);
                }
            }
    }
}