package Nasledovanie1;

public class Footballer extends Sportsman{
    String position;
    String club;
    public Footballer () {

    }
    public Footballer (String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }
    public void play () {
        System.out.println("Name: "+fullName+" "+"Age: "+age+" "+"Country: "+country+" "+"Club: "+club+" "+"Position: "+position+" is playing");
    }
}
