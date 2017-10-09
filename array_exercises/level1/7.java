// Find largest and smallest elements of an array. 
class code{
    public static int large(int[] A){
        int large = A[0];
            for(int ii=1; ii<A.length; ii++){
                if(A[ii]>large)
                    large = A[ii];
            }
        return large;
    }
    public static int small(int[] A){
        int small = A[0];
            for(int ii=1; ii<A.length; ii++){
                if(A[ii]<small)
                    small = A[ii];
            }
        return small;
    }
    public static void main(String[] args){
        int[] A = {-3,-2,-1,0,1,2,3};
        System.out.println("Mayor entero del arreglo = "+(large(A)));
        System.out.println("Menor entero del arreglo = "+(small(A)));
    }
}