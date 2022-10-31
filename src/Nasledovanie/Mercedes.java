package Nasledovanie;

public class Mercedes extends Car {
    String classType;
    public Mercedes () {

    }
    public Mercedes (String name, String model, int maxSpeed, int year, double volume, String classType){
        super (name, model, maxSpeed, year, volume);
        this.classType = classType;
    }
    public void ride () {
      System.out.println("Name: "+name+" "+"Model: "+model+" "+"MaxSpeed: "+maxSpeed+" "+"Year: "+year+" "+"ClassType: "+classType+" Car is ridding");
}
}

