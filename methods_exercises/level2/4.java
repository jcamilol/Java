/*Define a method named 'perfect' that determines if parameter number is a perfect number. 
Use this function in a program that determines and prints all the perfect numbers between 1 and 1000.
[An integer number is said to be "perfect number" if its factors, including 1(but not the number itself), sum to the number. 
E.g., 6 is a perfect number because 6=1+2+3]. */
class code{
    public static void perfect(int n){
        int sum = 0;
        for(int ii=1; ii<n; ii++){
            if(n%ii == 0)
                sum += ii;
        }
        if(sum == n)
            System.out.println(n);
    }
    public static void main(String[] args){
        for(int cc=1; cc<=1000; cc++){
            perfect (cc);
        }
    }
}