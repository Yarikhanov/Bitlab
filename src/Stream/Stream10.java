package Stream;

import java.util.ArrayList;
import java.util.Scanner;

public class Stream10 {
    public static void main (String []args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        ArrayList <Integer> chisla = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            chisla.add(in.nextInt());
        }
       int sum = chisla.stream().reduce(0, (a,b) -> a+b);
        System.out.println(sum);
    }
}
