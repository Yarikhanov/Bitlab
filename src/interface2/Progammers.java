package interface2;

public class Progammers implements Workers {
    int id;
    String nickName;
    int salary;
    int bonusSalary;
    double KPIValue;
    public String getWorkerData() {
        return "ID: "+id+" "+"Nick Name: "+nickName+" "+"Salary: "+salary+" "+"Bonus: "+bonusSalary+" "+"KPIValue: "+KPIValue;
    }
    public int getSalary() {
        return (int) (salary + KPIValue*bonusSalary);
    }
}
