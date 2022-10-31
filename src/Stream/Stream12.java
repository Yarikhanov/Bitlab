package Stream;

import java.util.ArrayList;
import java.util.Scanner;

public class Stream12 {
    public static void main (String []args) {
        Scanner in = new Scanner (System.in);
        int size = in.nextInt();
        ArrayList <Integer> chisla = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            chisla.add(in.nextInt());
        }
        chisla.stream().filter(a -> a%2==0).mapToInt(i -> i).average().ifPresent(a -> System.out.println((int) a));
    }
}
