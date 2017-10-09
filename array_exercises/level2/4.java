/*Sorting refers to arranging data in a particular format. Sort an array of integers in ascending order.
INPUT  = 2   3   1   45  15
OUTPUT = 1   2   3   15  45*/
class code{
    public static void orden(int[] A){
        for(int jj=0; jj<A.length-1; jj++){
            for(int ii=jj+1; ii<A.length; ii++){
                if(A[ii]<A[jj]){
                    int temp = A[jj];
                    A[jj] = A[ii];
                    A[ii] = temp;
                }
            }
        }
        for(int ii=0; ii<A.length; ii++){
            System.out.println(A[ii]+"\t");
        }
    }
    public static void main(String[] args){
        int[] A = {5,4,3,2,1};
        orden(A);
    }
}