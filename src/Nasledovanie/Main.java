package Nasledovanie;

public class Main {
    public static void main(String args[] ) throws Exception {

        Car[] cars = new Car[9];
        cars[0] = new Car("Mits", "Dever", 100, 2000, 2.0);
        cars [1] = new Car("Chevi", "Lacetti", 120, 2002, 3.2);
        cars [2] = new Car ("Dodge", "SRT", 140, 2003, 3.5);
        cars [3] = new Toyota("Toyota", "Camry", 130, 2005, 3.2, "Japan");
        cars [4] = new Toyota ("Toyota", "Chromo", 170, 2004,3.4, "China");
        cars [5] = new Toyota("Toyota", "Corolla", 175, 2003, 3.8, "Japan");
        cars [6] = new Mercedes("Mercedes", "E", 180, 2020,10.0, "E-class");
        cars [7] = new Mercedes("Mercedes", "S", 200, 2021, 12.0, "S-class");
        cars [8] = new Mercedes("Mercedes", "C", 220, 2022, 9.0, "C-class");
        for (int i = 0; i < cars.length; i++){
            cars[i].ride();
        }
    }
}
