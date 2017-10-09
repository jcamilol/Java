//Write a program to check if a year is leap year or not.
//If a year is divisible by 4 then it is leap year 
//but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400. 
class code{
    public static void main(String[] args){
        int n = 2000;
        if (n%100 == 0){
            if(n%400 == 0)
                System.out.println("El año es bisciesto");
            else 
                System.out.println("El año no es bisciesto");
        }
        else if(n%4 == 0)
            System.out.println("El año es bisciesto");
        else 
            System.out.println("El año no es bisciesto");
    }
}