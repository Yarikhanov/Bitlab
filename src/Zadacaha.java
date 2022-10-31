import java.util.Scanner;
public class Zadacaha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] words = str.split("\\s");
        String ans = "";
        int temp = 0;
        boolean flag = false;
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals("/")) {
                if (flag) {
                    temp = temp / Integer.parseInt((words[i - 1]));
                } else {
                    temp = Integer.parseInt((words[i - 1])) / Integer.parseInt((words[i + 1]));
                    flag = true;
                }
            }
            if (words[i].equals("*")) {
                if (flag) {
                    temp = temp * Integer.parseInt((words[i - 1]));
                } else {
                    temp = Integer.parseInt((words[i - 1])) * Integer.parseInt((words[i + 1]));
                    flag = true;
                }
            }
            if (words[i].equals("+")) {
                    temp = temp + Integer.parseInt((words[i + 1]));
            }
            if (words[i].equals("-")) {
                    temp = Integer.parseInt((words[i - 1])) - Integer.parseInt((words[i + 1]));
            }
        }System.out.println(temp);
    }
}// 0 - 0 - 9 - 8


        //int a =Integer.parseInt(String.valueOf(str.charAt(0)));
// char a = in.next().charAt(0)




