package Stream;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Stream30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> chisla = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            chisla.add(in.nextInt());
        }
        long sum = IntStream.range(0, chisla.size()-1).filter(a -> chisla.get(a) < 0 && chisla.get(a+1) < 0 || chisla.get(a) > 0 && chisla.get(a+1) > 0 ).count();
        if (sum > 0)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
