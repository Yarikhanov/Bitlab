package incapsulacia;

import java.util.Objects;

public class Main3 {
public static void main(String []args){
Phone1 [] phones = new Phone1[10];
phones [0] = new Phone1 ("Iphone", "13", 200, 77);
phones [1] = new Phone1 ("Ipho", "13pro", 1300, 17);
phones [2] = new Phone1 ("hone", "14", 600, 77);
phones [3] = new Phone1 ("one", "1", 700, 70);
phones [4] = new Phone1 ("honor", "one", 12000, 87);
phones [5] = new Phone1 ("Ip", "3", 200, 57);
phones [6] = new Phone1 ("pho", "19", 1700, 100);
phones [7] = new Phone1 ("X", "10", 2200, 27);
phones [8] = new Phone1 ("S", "10", 5200, 27);
phones [9] = new Phone1 ("E", "10", 4200, 27);
    for (int i = 0; i < phones.length; i++){
        if (phones[i].getCategory().equalsIgnoreCase("SIMPLE") || Objects.equals(phones[i].getCategory(), "TOP"))
        System.out.println(phones[i].getName()+" "+phones[i].getModel()+" "+phones[i].getMemory()+" "+phones[i].getCategory());
    }
}
}
