//Este código muestra un method para sumar todos los elementos de un array dado
class code{
    public static void sum(int[] z){
        int sum = 0;
            for(int ii=0; ii<z.length; ii++){
                sum += z[ii];}
        System.out.println(sum);
    }
    public static void main(String[] args){
        int[] x = {13,55,32,21,72};
        sum(x);
    }
}