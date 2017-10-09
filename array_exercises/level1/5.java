// Write a program to find the sum and product of all elements of an array. 
class code{
    public static int sum(int[] A){ //Función que halla la suma de todos los elementos de un array
        int sum = 0;
        for(int ii=0; ii<(A.length); ii++){
            sum += A[ii];
        }
        return sum;
    }
    public static int mult(int[] A){ //Función que halla el producto de todos los elementos de un array
        int mult = 1;
        for(int ii=0; ii<(A.length); ii++){
            mult *= A[ii];
        }
        return mult;
    }
    public static void main(String[] args){
        int[] A = {1,1,1,1,1};
        System.out.println("Suma = "+sum(A));
        System.out.println("Producto = "+mult(A));
    }
}