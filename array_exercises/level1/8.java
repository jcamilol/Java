//Write a program to check if elements of an array are same or not it read from front or back. E.g.-
//2  3  15  15  3  2
class code{
    public static void ana(int[] A){ //Función para determinar si una matriz A es un anagrama
        int jj=(A.length-1), cont=0;
            for(int ii=0; ii<A.length; ii++){
                if(A[ii] == A[jj]) //Si el primer elemento es igual al último elemento (etc), el contador se incrementa en uno
                    cont++;
                else{
                    System.out.println("El arreglo NO es un anagrama"); //Si no son iguales, entonces el proceso termina
                    break;
                }
                jj--;
            }
            if(cont == A.length) //Si todos los pares de elementos son iguales, quiere decir que el break nunca fue ejecutado, por lo que el contador se incrementó en todos los ciclos. Ya que el número de ciclos es igual al número de elementos del arreglo, se debe cumplir el if para que sea un anagrama.
                System.out.println("El arreglo SÍ es un anagrama");
    }
    public static void main(String[] args){
        int[] A = {2,3,15,15,3,2};
        int[] B = {2,3,15,17,15,3,2};
        int[] C = {1,1,1,0,1,1,1,1};
        int[] D = {1,2,3,-3,-2,-1};
        ana(A);
        ana(B);
        ana(C);
        ana(D);
    }
}