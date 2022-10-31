package Nasledovanie1;

public class Sportsman {
    String fullName;
    int age;
    String country;

    public  Sportsman() {

    }
    public Sportsman (String fullName, int age, String  country) {
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }
    public void play () {
        System.out.println("Name: "+fullName+" "+"Age: "+age+" "+"Country: "+country+" is playing");
    }
}
