package Stream;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Stream26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> chisla = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            chisla.add(in.nextInt());
        }
        IntStream.range(0, chisla.size()).forEach(a -> System.out.print(chisla.get(chisla.size()-1-a)));
    }
}

