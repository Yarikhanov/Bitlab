package Stream;

import java.util.ArrayList;
import java.util.Scanner;

public class Stream18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> chisla = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            chisla.add(in.nextInt());
        }
        int max = chisla.stream().max(Integer::compareTo ).get();
        System.out.println(max);
    }
}