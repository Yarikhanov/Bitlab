package Nasledovanie2;

public class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;
    public Staff () {

    }
    public Staff (int id, String login, String password, String name, String surname,double salary) {
        super(id, login, name, surname, password);
        this.salary = salary;
    }
    public double getSalary () {
        return salary;
    }
    public void setSalary () {
      this.salary = salary;
    }
    public void addSubject (String subject) {
        subjects[indexOfSubject] = subject;
        indexOfSubject++; //счетчик после, иначе пропустится 0
    }
    public void getData (){
        System.out.println("ID: "+id+" "+"login: "+login+" "+"password: "+password+" "+"Name: "+name+" "+"Surname: "+surname+" "+"Salary: "+salary);
        for (int i = 0; i < indexOfSubject; i++) {
            System.out.println( subjects[i]);
        }
    }

}
