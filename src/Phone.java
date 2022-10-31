public class Phone {
    String name;
    String model;
    int price;
    public Phone () {
        this.name = "No name";
        this.model = "Null";
        this.price = 1000;
    }
    public Phone (String name , String model , int price ){
        this.name = name;
        this.model = model;
        this.price = price;
    }
    public void getData () {
        System.out.println("Name:"+" "+name+" "+"Model:"+" "+model +" "+"Price:"+" "+price);
    }
}
