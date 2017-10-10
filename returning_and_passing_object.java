//Este código muestra como un método puede usar como argumento uno o varios objetos, y también como puede retornar un objeto
class Account{
    public int balance;
    public Account(){ //Método constructor que le asigna a balance el valor de 0
        balance = 0;
    }
    public static Account getAcc(Account a, Account b){ //Método que usa como argumentos dos objetos de la clase Account y que retorna un objeto de la clase account
        Account ac = new Account(); //Se crea un nuevo objeto ac de la clase Account
        ac.balance = a.balance + b.balance;
        return ac;
    }
}
class code{
    public static void main(String[] args){
        Account a1 = new Account(); //Objeto a1 de la clase Account
        a1.balance = 50; //Al ser balance público, puede ser llamado dentro de otra classe diferente a Account. Se le asigna el valor de 50
        Account a2 = new Account(); //Objeto a2 de la clase Account
        a2.balance = 60;
        Account b = Account.getAcc(a1,a2); //Se crea el objeto b para guardar el objeto que retorna el método getAcc
        System.out.println(b.balance);
    }
}