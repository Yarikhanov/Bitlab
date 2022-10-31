package classandmethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("PRESS [1] TO ADD STUDENT");
        System.out.println("PRESS [2] TO LIST STUDENT");
        System.out.println("PRESS [0] TO EXIT");
        Scanner in = new Scanner(System.in);
       Student [] students = new Student[1000];
       int i = 0;
       while(true){
           int a = in.nextInt();
           if ( a == 1) {
               System.out.println("Insert name");
               String name = in.next();
               System.out.println("Insert surname");
               String surname = in.next();
               System.out.println("Insert GPA");
               double gpa = in.nextDouble();
               students [i] = new Student(i+1, name, surname, gpa);
               System.out.println(students[i]);
               i++;
           }
           else if (a == 2){
           for (int j = 0; j < i; j++){
               System.out.println(students[j]);
           }
        }
       else if (a == 0) {
           break;
           }


       }
//        students[0] = new ch2.Student(1, "Volodya", "Soloviev", 2.3);
//        students[1] = new ch2.Student(2, "Dmitriy", "Guber", 2.6);students[2] = new ch2.Student(3, "Ramzan", "Ahmedov", 2.0);
//        students[3] = new ch2.Student(4, "Roman", "Avdeev", 3.0);
//        students[4] = new ch2.Student(5, "Vasya", "Pupkin", 5.0);
//        students[5] = new ch2.Student(6, "Salam", "Aleykum", 210.3);
//        students[6] = new ch2.Student(7, "Ivan", "Dorn", 7.6);
//        students[7] = new ch2.Student(8, "Basta", "Naggano", 6.0);
//        students[8] = new ch2.Student(9, "Ivan", "Durak", 3.7);
//        students[9] = new ch2.Student(10, "Baran", "Ovechkin", 5.9);
//       System.out.println(topStudent(students));


//    }
//
//    static ch2.Student topStudent(ch2.Student[] students) {
//        ch2.Student s = students [0];
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].gpa > s.gpa) {
//                s = students[i];
//            }
//
//        }
//
//
//        return s;
   }
}

