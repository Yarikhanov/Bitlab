import java.util.Scanner;

public class Main5 {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner (System.in);
        String name = in.next();
        System.out.println("Name: "+name);
        String surname = in.next();
        System.out.println("Surname: "+surname);
        int age = in.nextInt();
        System.out.println("Age: "+age);
        String country = in.next();
        System.out.println("Country: "+country);
    }
}
