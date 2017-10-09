//Given an unsorted array arr[0..n-1] of size n, find the minimum length subarray arr[s..e]
//such that sorting this subarray makes the whole array sorted.
import java.lang.*;
class code{
    public static void subarr(int[] A){
        int linf = A[0], lsup = A[A.length-1];
        for(int ii=1; ii<A.length; ii++){ // Buscamos el elemento que no sigue la secuencia de incremento
            if(A[ii]<A[ii-1]){
                linf = ii;
                break;
            }
        }
        for(int ii=A.length-2; ii>=0; ii--){// Buscamos el elemento que no sigue la secuencia de decremento
            if(A[ii]>A[ii+1]){
                lsup = ii; 
                break;
            }
        }
        int ai = Math.min(linf,lsup);
        int ci = Math.max(linf,lsup);
        int men = A[ai];
        int may = A[ci];
        int cai = ai;
        int cci = ci;
        for(int ii = cai; ii<=cci; ii++){ //Calculamos el mayor dato en el intervalo [ai,ci]
            if(A[ii]<men){
                men = A[ii];
                ai = ii;
            }
        }
        for(int ii = cai; ii<=cci; ii++){ //Calculamos el menor dato en el intervalo [ai,ci]
            if(A[ii]>may){
                may = A[ii];
                ci = ii;
            }
        }
        cai = ai;
        cci = ci;
        for(int ii = cai; ii>=0; ii--){ //Desde el menor dato en el intervalo se lee hacia la izquierda, y si hay un dato menor se le asigna ai al index que está después de ese
            if(A[ii]<A[cai]){
                ai = ii+1;
                break;}
            else
                ai = 0; //Por default, si no encuentra menores que el menor del intervalo, se debe ordenar desde el index 0
        }
        for(int ii = cci; ii<A.length; ii++){ //Desde el mayor dato en el intervalo se lee hacia la derecha, y si hay un dato mayor se la asigna ci al index que está antes de ese 
            if(A[ii]>A[cci]){
                ci = ii-1;
                break;}
            else
                ci = A.length-1; //Por default, si no encuentra mayores al mayor del intervalo, se debe ordenar hasta el último index
        }
        System.out.println("index subarray = "+"["+(ai)+","+(ci)+"]");
    }
    public static void main(String[] args){
        int[] A = {0,1,15,25,6,7,30,40,50}; //inf = 2; sup = 5
        int[] B = {10,12,20,30,25,40,32,31,35,50,60}; //inf = 3; sup = 8
        subarr(A);
        subarr(B);
        int[] C = {1,2,3,5,4,6,7,8,9};
        subarr(C);
    }
}