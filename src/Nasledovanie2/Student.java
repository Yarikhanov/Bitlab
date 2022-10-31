package Nasledovanie2;

public class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student() {
    }

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, name, surname, password);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa() {
        this.gpa = gpa;
    }

    public void getData() {
        System.out.println("ID: " + id + " " + "login: " + login + " " + "password: " + password + " " + "Name: " + name + " " + "Surname: " + surname + " " + "GPA: " + gpa);
        for (int i = 0; i < indexOfCourses; i++) {
            System.out.println(courses[i]);
        }
    }
    public void addCourses (String course) {
        courses[indexOfCourses] = course;
        indexOfCourses++;

    }
}
//счетчик после, иначе пропустится 0