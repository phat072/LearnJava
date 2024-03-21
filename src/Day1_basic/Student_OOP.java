package Day1_basic;

public class Student_OOP {
    public static void main(String[] args) {
        System.out.println("Thong tin mot hoc sinh");

        Student st1 = new Student();
        st1.name = "Phan Ca Phat";
        st1.age = 18;
        st1.address = "TP.HCM";
        System.out.println("Student with name: "+ st1.name + " with age: " + st1.age);
    }
}
