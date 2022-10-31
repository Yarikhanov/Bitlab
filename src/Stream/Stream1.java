package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Stream1 {
    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList <Integer> chisla = new ArrayList<>();
        for (int i = 0; i < n; i++){
            chisla.add(in.nextInt());
        }
        chisla.stream().map( a -> n*n).forEach(a -> System.out.println(a));
    }
}
