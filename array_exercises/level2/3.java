/*Initialize a 2D array of 3*3 matrix. E.g.-
1 	2 	3
4 	5 	6
7 	8 	9
Check if the matrix is symmetric or not.*/
class code{
    public static void sym(int[][] A){
        boolean bool = true;
        for(int ii=0; ii<=2; ii++){
            for(int jj=0; jj<=2; jj++){
                if(A[ii][jj] != A[jj][ii])
                    bool = false;
            }
        }
        if(bool == true)
            System.out.println("La matriz SÍ es simétrica");
        else
            System.out.println("La matriz NO es simétrica");
    }
    public static void main(String[] args){
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        sym(A);
        int[][] B = {{1,0,0},{0,1,0},{0,0,1}};
        sym(B);
    }
}