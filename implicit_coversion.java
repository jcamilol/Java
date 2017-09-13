//Este código muestra un ejemplo de conversión de tipo de dato implícita, pues la variable ch definida como de tipo char, al ser usada en la suma, es implícitamente convertida en una variable de tipo int, donde su valor es asignado por su valor ASCII
class code{
    public static void main(String[] args){
	int a=10;
	char ch='h';
	int sum=(a+ch);
	System.out.println(sum);
    }
}
