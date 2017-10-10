class Student{
    private String name;
    public Student(){ //Método constructor
        name = "desconocido";
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
class code{
    public static void main(String[] args){
        Student a = new Student(); //Objeto a de la clase Student
        System.out.println(a.getName());
        a.setName("xyz");
        String b = a.getName();
        System.out.println(b);
    }
}