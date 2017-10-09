/*Take an array of length n where all the numbers are nonnegative and unique.
Find the element in the array possessing the highest value.
Split the element into two parts where first part contains the next highest value in the array 
and second part hold the required additive entity to get the highest value. 
Print the array where the highest value get splitted into those two parts.
Sample input: 4 8 6 3 2
Sample output: 4 6 2 6 3 2*/
class code{
    public static void newarr(int[] A){
        int max = A[0], indmax = 0;
        for(int ii=0; ii<A.length; ii++){ //Calculamos el mayor entero en el arreglo y el espacio al cual está indexado
            if(A[ii]>max){
                max = A[ii];
                indmax = ii;
            }
        }
        int submax = A[0];
        for(int ii=0; ii<A.length; ii++){ //Calculamos el segundo mayor entero y el index
            if(ii != indmax){
                if(A[ii]>submax)
                    submax = A[ii];
            }
        }
        int[] B = new int[A.length+1];
        for(int ii=0; ii<B.length; ii++){ //Definimos el nuevo arreglo
            if(ii == indmax){ //Se realiza la partición del número mayor y se corren los enteros
                B[ii] = submax;
                B[ii+1] = (max-submax);
                for(int jj=ii+2; jj<B.length; jj++){ 
                    B[jj] = A[jj-1];
                }
                break;
            }
            else{
                B[ii] = A[ii];
            }
        }
        for (int ii=0; ii<B.length; ii++){ // Imprimimos el nuevo arreglo
            System.out.println(B[ii]);
        }
    }
    public static void main(String[] args){
        int[] A = {4,8,6,3,2};
        newarr(A);
    }
}