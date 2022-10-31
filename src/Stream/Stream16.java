package Stream;

import java.util.ArrayList;
import java.util.Scanner;

public class Stream16 {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList <Integer> chisla = new ArrayList<>();
        for (int i = 0; i < size; i++){
            chisla.add(in.nextInt());
        }
        int k = in.nextInt();
        chisla.stream().filter(a -> a%k == 0).forEach(a -> System.out.println(a));
    }
}
