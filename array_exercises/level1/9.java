/*Take an array of 10 elements. Split it into middle and store the elements in two dfferent arrays. E.g.-
INITIAL array :
58 	24 	13 	15 	63 	9 	8 	81 	1 	78

After spliting :
58 	24 	13 	15 	63
9 	8 	81 	1 	78*/
class code{
    public static void split(int[] A){
        int[] C = new int [5];
        int[] D = new int [5];
        for(int ii=0; ii<5; ii++){
            C[ii] = A[ii];
        }
        int jj=0;
        for(int ii=5; ii<10; ii++){
            D[jj] = A[ii];
            jj++;
        }
        System.out.println("A1\tA2");
        for(int ii=0; ii<5; ii++){
            System.out.println(C[ii]+"\t"+D[ii]);
        }
    }
    public static void main(String[] args){
        int[] A = {58,24,13,15,63,9,8,81,1,78};
        split(A);
    }
}