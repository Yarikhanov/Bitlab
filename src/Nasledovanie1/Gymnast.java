package Nasledovanie1;

public class Gymnast extends  Sportsman {
    int height;
    int weight;
    String style;
    public Gymnast () {
    }
    public Gymnast (String fullName, int age, String country,int height, int weight, String style) {
        super (fullName, age, country);
        this.height = height;
        this.weight = weight;
    }
    public void play () {
        System.out.println("Name: "+fullName+" "+"Age: "+age+" "+"Country: "+country+" "+"Height: "+height+"Weight: "+weight+" is playing");
    }
}
