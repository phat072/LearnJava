package Day2_OOP;

import java.util.Scanner;

public class Create_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20; // Set the number of students to 20
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            // Assume that the Student class has a method to set scores and name
            students[i].setStudentId(21520389 + i);
            students[i].setStudentName("Student " + (i+1));
            students[i].setMathScore((float)Math.random()*10);
            students[i].setPhysicsScore((float)Math.random()*10);
            students[i].setProgrammingIntroScore((float)Math.random()*10);
        }

        // The rest of your code...
    }
}
