//Suppose there are 2 factories and each of these factories produces items of 4 different types, like some items of type 1, some items of type 2 and so on. 
//We have to calculate the total product of each factory i.e. sum of the items of each type that a factory produces.
class code{
    public static void main(String[] args){
        int[][] A = new int[4][2]; //Dos empresas, con 4 productos cada una
        A[0][0] = 4; //Definimos el número de items de cada producto de la empresa 1
        A[1][0] = 7;
        A[2][0] = 2;
        A[3][0] = 8;
        A[0][1] = 5; //Definimos el número de items de cada producto de la empresa 2
        A[1][1] = 11;
        A[2][1] = 2;
        A[3][1] = 17;
            for(int jj=0; jj<2; jj++){
                int sum = 0;
                    for(int ii=0; ii<4; ii++){
                        sum += A[ii][jj]; 
                    }
                System.out.println("Suma de los items de la empresa "+(jj+1)+" = "+sum);
            }
    }
}