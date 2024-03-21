package Day2_OOP;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student " + (i + 1) + " information:");
            students[i] = new Student();
            students[i].inputStudent();
        }

        //list students achieve scholarships
        System.out.println("List of students achieve scholarships:");
        for (int i = 0; i < n; i++) {
            if (students[i].getAverageScore() >= 8.0 && students[i].getProgrammingIntroScore() >= 9.0) {
                students[i].outputStudent();
            }
        }

        //list students have the highest average score
        float highAve = 0;
        for (int i = 0; i < n; i++) {
            if (students[i].getAverageScore() > highAve) {
                highAve = students[i].getAverageScore();
            }
        }

        System.out.println("List of students have the highest average score:");
        for (int i = 0; i < n; i++) {
            if (students[i].getAverageScore() == highAve) {
                students[i].outputStudent();
            }
        }

        //Top 10 students have the highest average score
        System.out.println("Top 10 students have the highest average score:");
        Arrays.sort(students, Collections.reverseOrder());
        for (int i = 0; i < 10; i++) {
            students[i].outputStudent();
        }
        sc.close();
    }
}
