package classandmethod;

// класс
public class Student {
    int id;
    String name;
    String surname;
    double gpa;
    public Student() {
        this.id = -1;
        this.name = "No name";
        this.surname = "No surname";
        this.gpa = 0.0;
    }
    public Student(int id, String name, String surname, double gpa){
        this.id=id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    // метод
    public void getStudentData(){
        System.out.println("ID:"+" "+id+" "+"Name:"+" "+name+" "+"Surname:"+" "+surname+" "+"GPA:"+" "+gpa);
    }
    public String toString() {
        return id+") "+name+" "+surname+" "+gpa;
    }
}
