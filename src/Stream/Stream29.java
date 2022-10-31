package Stream;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Stream29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> chisla = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            chisla.add(in.nextInt());
        }
        int result = IntStream.range(chisla.indexOf(0)+1 , chisla.lastIndexOf(0)).map(a -> chisla.get(a)).reduce(0,(a,b)->a+b);
        System.out.println(result);
    }
}
// chisla.indexOf(0)+1 - указываем с какого начинать, то есть первое вхождение в массив нуля, включая 0, чтобы его не учитывать делаем +1