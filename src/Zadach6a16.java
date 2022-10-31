import java.util.*;
import java.util.Scanner;
public class Zadach6a16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String numbers = "0123456789";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int a = 0;
            if (numbers.contains(Character.toString(str.charAt(i)))) {
                int n = Integer.parseInt(String.valueOf(str.charAt(i)));
                sum+=n;

            }
        }System.out.print(sum);
    }
}
