package interface2;

public class HRManagers implements Workers {
    int id;
    String fullName;
    int salary;
    public String getWorkerData() {
        return "ID: "+id+" "+"Full Name: "+fullName+"Salary: "+salary;
    }
    public int getSalary() {
        return salary;
    }

    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }
}
