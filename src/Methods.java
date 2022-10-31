import java.util.Scanner;
import java.util.StringJoiner;

public class Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ave(n);
    }
    public static void ave(int n) {
       if ( n==12 || n==1 || n==2) {
           System.out.println("Winter");
       }
        if ( n==3 || n==4 || n==5) {
            System.out.println("Spring");
        }
        if ( n==6 || n==7 || n==8) {
            System.out.println("Summer");
        }
        if ( n==9 || n==10 || n==11) {
            System.out.println("Autumn");
        }
    }
}






