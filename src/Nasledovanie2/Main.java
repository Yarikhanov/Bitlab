package Nasledovanie2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User[] users= new User[100];
        int i = 0;
        while (true) {
            System.out.println("PRESS [1] TO ADD USERS");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            int a = in.nextInt();
            if (a == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD STAFF");
                int a1 = in.nextInt();
                if (a1 == 1) {
                    System.out.println("Insert name");
                    String name = in.next();
                    System.out.println("Insert surname");
                    String surname = in.next();
                    System.out.println("Insert login");
                    String login = in.next();
                    System.out.println("Insert pass");
                    String password = in.next();
                    System.out.println("Insert gpa");
                    Double gpa= in.nextDouble();
                    users[i] = new Student (i+1, login,password,name,surname,gpa);
                    users[i].getData();
                   i++;
                }
                if (a1 == 2) {
                    System.out.println("Insert name");
                    String name = in.next();
                    System.out.println("Insert surname");
                    String surname = in.next();
                    System.out.println("Insert login");
                    String login = in.next();
                    System.out.println("Insert pass");
                    String password = in.next();
                    System.out.println("Salary");
                    Double salary = in.nextDouble();
                    users [i] = new Staff (i+1, login, password, name, surname, salary);
                    users[i].getData();
                    i++;
                }
            }
            if (a== 2) {
                System.out.println("PRESS [1] TO LIST STUDENT");
                System.out.println("PRESS [2] TO LIST STAFF");
                int a1 = in.nextInt();;
                if (a1 == 1) {
                    for (int j = 0; j < i; j++){
                        if (users[j] instanceof Student)
                            users[j].getData();
                    }
                }
                 else if (a1 == 2) {
                    for (int j = 0; j < i; j++){
                        if (users[j] instanceof Staff)
                            users[j].getData();
                    }
                }


            }
            }
        }
//        User [] users = new User [15];
//        users [0] = new User (1, "T", "123", "Vova", "Zeleniy");
//        users [1] = new User (2, "V", "1233", "Viva", "Zelen");
//        users [2] = new User (3, "P", "1232433", "Vovi", "Leniy");
//        users [3] = new User (4, "O", "123243", "Veva", "Zele");
//        users [4] = new User (5, "Q", "12sdf3", "Vava", "Zeniy");
//        Student x = new Student (6, "L", "12wsd", "Vasya", "Vik", 3.3);
//        x.addCourses("Khasan");
//        users[5] = x;
//        users [6] = new Student (7, "L", "12wsd", "Vasa", "Vik", 3.3);
//        users [7] = new Student (8, "L", "12wsd", "Vsya", "Vik", 3.9);
//        Student p = new Student (9, "L", "12wsd", "asya", "Vik", 3.7);
//        p.addCourses("java");
//        users[8] = p;
//        users [9] = new Student (10, "L", "12wsd", "Vya", "Vik", 3.8);
//        users [10] = new Staff (10, "W", "12wsd", "Vya", "Vik", 34304);
//        users [11] = new Staff (10, "S", "12wsd", "Vya", "Vik", 3900);
//        Staff q = new Staff (10, "X", "12wsd", "Vya", "Vik", 3500);
//        q.addSubject("Matan");
//        users[12] = q;
//        users [13] = new Staff (10, "A", "12wsd", "Vya", "Vik", 3000);
//        users [14] = new Staff (10, "Q", "12wsd", "Vya", "Vik", 2000);
//        for (int i = 0; i < users.length; i++){
//            users[i].getData();
//        } // для 5 задачи!!

    }
