//The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'. 
class code{
    public static void main(String[] args){
        int clase=90;
        int A=clase/2;
        int hombreA=20;
        int mujerA=A-hombreA;
        System.out.println("La cantidad de mujeres del grado A en la clase es de "+mujerA);
    }
}