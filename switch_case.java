//Este código es un ejemplo sencillo del uso del switch...case statement
class code{
    public static void main(String[] args){
        char nota = 'B';
        switch (nota){
            case 'A':
            System.out.println("Excelente");
            break;
            case 'B':
            System.out.println("Sobresaliente");
            break;
            case 'C':
            System.out.println("Bien");
            break;
            case 'D':
            System.out.println("Puede ser mejor");
            break;
            case 'E':
            System.out.println("Apenas aprobó");
            break;
            case 'F':
            System.out.println("Fallaste");
            break;
            default:
            System.out.println("Nota inválida");
        }
    }
}