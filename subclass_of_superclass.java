//Este código muestra como crear una subclase de una superclase. En este caso se crea la clase "Undergraduate" como una extensión o subclase de la clase "Student"
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
}
class main{
    public static void main(String[] args){
        Student s = new Student();
        Undergraduate u = new Undergraduate();
        s.printAbout();
        u.printAbout();
    }
}