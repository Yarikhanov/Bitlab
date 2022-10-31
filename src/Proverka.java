import java.util.Scanner;

public class Proverka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a * b;
        System.out.println((int) Math.pow(sum, 0.5));
    }
}
