package Stream;

import java.util.ArrayList;
import java.util.Scanner;

public class Stream {
    public static void main (String []args) {
        Scanner in = new Scanner (System.in);
    ArrayList <Integer> chisla = new ArrayList<>();
    int n = in.nextInt();
    for (int i = 0; i < n; i++){
        chisla.add(in.nextInt());
    }
    chisla.stream().filter(a -> a > 0).forEach(a -> System.out.println(a));

    }
}
