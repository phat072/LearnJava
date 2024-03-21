package Day2_OOP;

import java.util.Scanner;

public class Student implements Comparable<Student>{
    Scanner sc = new Scanner(System.in);
    private int studentId;
    private String studentName;
    private float mathScore;
    private float physicsScore;
    private float programmingIntroScore;
    private final float averageScore;

    public Student(){
        this.studentId = 0;
        this.studentName = "";
        this.mathScore = 0;
        this.physicsScore = 0;
        this.programmingIntroScore = 0;
        this.averageScore = 0;
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.averageScore - o.averageScore);
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getMathScore() {
        return mathScore;
    }

    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }

    public float getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(float physicsScore) {
        this.physicsScore = physicsScore;
    }

    public float getProgrammingIntroScore() {
        return programmingIntroScore;
    }

    public void setProgrammingIntroScore(float programmingIntroScore) {
        this.programmingIntroScore = programmingIntroScore;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public float calculateAverageScore(){
        return (this.mathScore + this.physicsScore + this.programmingIntroScore) / 3;
    }

    public void inputStudent(){
        System.out.println("Enter student id: ");
        this.studentId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student name: ");
        this.studentName = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter math score: ");
        this.mathScore = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter physics score: ");
        this.physicsScore = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter programming intro score: ");
        this.programmingIntroScore = sc.nextFloat();
        sc.nextLine();
    }

    public void outputStudent(){
        System.out.println("Student id: " + this.studentId);
        System.out.println("Student name: " + this.studentName);
        System.out.println("Math score: " + this.mathScore);
        System.out.println("Physics score: " + this.physicsScore);
        System.out.println("Programming intro score: " + this.programmingIntroScore);
        System.out.println("Average score: " + this.calculateAverageScore());
    }
}
