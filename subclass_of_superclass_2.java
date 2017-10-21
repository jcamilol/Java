//Este código muestra el error producto de querer llamar un método de una suclase con un objeto creado como de la superclase. Además muestra que no se puede acceder a metodos privados de una superclase desde una subclase
class Student{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public void printAbout(){
        System.out.println("I am a student");
    }
}

class Undergraduate extends Student{

    public void printAbout(){
        System.out.println("I am a undergraduate");
    }

    public void printName(){
        System.out.println(name);
    }
}

class main{
    public static void main(String[] args){
        Student s = new Undergraduate();
        s.setName("xyz");
        s.printName();
    }
}