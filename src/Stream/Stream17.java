package Stream;

import java.util.ArrayList;
import java.util.Scanner;

public class Stream17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> chisla = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            chisla.add(in.nextInt());
        }
      int result =  chisla.stream().filter(a -> a !=0).filter(a -> chisla.indexOf(a)%2==0).reduce(1, (a, b) -> a*b);
        System.out.println(result);
    }
}
