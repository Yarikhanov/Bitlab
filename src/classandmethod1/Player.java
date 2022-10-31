package classandmethod1;

public class Player {
    int number;
    String name;
    String surname;
    String position;
    public Player() {
        this.number = 0;
        this.name = "No name";
        this.surname = "No surname";
        this.position = "-";
    }
    public Player (int number, String name, String surname, String position){
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }
    public  String toString(){
        return number+" "+" "+name+" "+" "+surname+" "+position;
    }
}
