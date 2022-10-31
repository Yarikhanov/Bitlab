package Stream;

import java.util.ArrayList;
import java.util.Scanner;

public class Stream14 {
    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList <Integer> chisla = new ArrayList<>();
        for (int i = 0; i < size; i++){
           chisla.add(in.nextInt());
        }
        double x = chisla.stream().mapToInt(i -> i).average().getAsDouble();
        chisla.stream().filter(a -> a > x).forEach(a -> System.out.println(a));
    }
}
