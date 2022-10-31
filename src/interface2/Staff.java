package interface2;

public class Staff implements Workers {
    int id;
    String name;
    String surname;
    int salary;
    public String getWorkerData() {
        return "ID: "+id+" "+"Name: "+name+" "+"Surname: "+surname+" "+"Salary: "+salary;
    }
    public int getSalary() {
        return salary;
    }

}
