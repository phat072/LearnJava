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

    public static class Bai9 {
        public static int[] ShuffleArray(int[] a){
            Random rand = new Random();
            for(int i=0;i<a.length;i++){
                int randomIndexToSwap = rand.nextInt(a.length);
                int temp = a[randomIndexToSwap];
                a[randomIndexToSwap] = a[i];
                a[i] = temp;
            }
            return a;
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so luong cong dan: ");
            int N = sc.nextInt();
            int[] arrayId = new int[N];
            for(int i=0;i<N;i++){
                arrayId[i]=i;
            }
            System.out.println("ID: "+ Arrays.toString(arrayId));
            int[] ContacTee;
            ContacTee = ShuffleArray(arrayId);
            System.out.println("Contactee: "+Arrays.toString(ContacTee));
            int ID;

            do{
                System.out.println("Nhap id doi tuong can truy vet: ");
                ID = sc.nextInt();
            }while(ID<0||ID>N);

            System.out.println("ID can truy vet: "+ID);
            int temp = ID;
            int count = 0;
            do{
                System.out.print(temp+" ");
                temp = arrayId[temp];
                count++;
            }while(temp != ID && count < N);
        }
    }
}
