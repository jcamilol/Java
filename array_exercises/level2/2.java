/*Write a program to shift every element of an array to circularly right. E.g.-
INPUT : 1 2 3 4 5
OUTPUT : 5 1 2 3 4*/
class code{
    public static void newarr(int[] A){
        int[] B = new int [A.length];
        B[0] = A[A.length-1];
        for(int ii=0; ii<A.length-1; ii++){
            B[ii+1] = A[ii];
        }
        for(int ii=0; ii<B.length; ii++){
            System.out.println(B[ii]);
        }
    }
    public static void main(String[] args){
        int[] A = {1,2,3,4,5};
        newarr(A); 
    }
}