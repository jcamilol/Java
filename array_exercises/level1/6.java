// Initialize and print all elements of a 2D array. 
class code{
    public static void main(String[] args){
        int[][] A = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int ii=0; ii<3; ii++){
            for(int jj=0; jj<3; jj++){
                System.out.print(A[ii][jj]+"\t");
            }
        System.out.println();
        }
    }
}