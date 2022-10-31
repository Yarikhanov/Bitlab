package Nasledovanie;

public class Toyota extends Car{
    String manufacturer;
    public Toyota () {

    }
    public Toyota (String name, String model, int maxSpeed, int year, double volume, String  manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }
    public void ride () {
        System.out.println("Name: "+name+" "+"Model: "+model+" "+"MaxSpeed: "+maxSpeed+" "+"Year: "+year+" "+"Volume: "+volume+" "+"Manufacturer "+manufacturer+" Car is ridding");
    }
}
