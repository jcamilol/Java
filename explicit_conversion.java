//Este código da un ejemplo de conversión de tipo de dato explícito, al definir a sum como double luego de haberlo definido como int, para así poder realizar la división en tipo double
class code{
    public static void main(String[] args){
	int sum=23;
	int n=7;
	double avg;
	avg=(double)sum/n;
	System.out.println("Average= "+avg);
    }
}
