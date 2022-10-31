package incapsulacia;

public class Phone1 {
   private String name;
    private String model;
    private int price;
    private int memory;
    public Phone1 (String name, String model, int price, int memory) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.model = model;
    }
    public Phone1() {
    }
    public String getName () {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getModel (){
        return model;
    }
    public void setModel() {
        this.model = model;
    }
    public int getPrice () {
        return price;
    }
    public void setPrice () {
        this.price = price;
    }
    public int getMemory () {
        return  memory;
    }
    public void setMemory () {
        this.memory = memory;
    }
    public String getCategory () {
        if (price >= 1000) {
            return ("TOP");
        }
        else if (price < 1000 && price >= 500) {
            return ("MEDIUM");
        }
        else return ("SIMPLE");
    }
}
