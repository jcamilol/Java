// Print the multiplication table of 15 using recursion. 
class code{
    public static void tabla(int x, int y){
        if(y != 1){
            tabla(x, y-1);}
        System.out.println(x*y);
    }
    public static void main(String[] args){
        tabla(15, 10);
    } 
} 
