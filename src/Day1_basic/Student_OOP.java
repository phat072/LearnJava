package Day1_basic;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Student_OOP {
    public static void main(String[] args) {
        System.out.println("Thong tin mot hoc sinh");

        Student st1 = new Student();
        st1.name = "Phan Ca Phat";
        st1.age = 18;
        st1.address = "TP.HCM";
        System.out.println("Student with name: "+ st1.name + " with age: " + st1.age);
    }

    public static class Student {
        public String name;
        public int age;
        public String address;
    }
}
