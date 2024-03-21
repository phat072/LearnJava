package Day1_basic;

import java.util.*;

public class  Bai5 {
    public static void main(String[] args){
        String s1;
        String s2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi 1: ");
        s1 = sc.nextLine();
        System.out.print("Nhap chuoi 2: ");
        s2 = sc.nextLine();

        int length_sum = s1.length() + s2.length();
        System.out.println("Tong chieu dai cua 2 chuoi: " + length_sum);

        StringBuilder sub_s1 = new StringBuilder();
        StringBuilder sub_s2 = new StringBuilder();
        for(int i = 0; i<3; i++){
            sub_s1.append(s1.charAt(i));
            sub_s2.append(s2.charAt(i));
        }
        System.out.println("Ba ki tu dau cua chuoi 1: " + sub_s1);
        System.out.println("Ba ki tu dau cua chuoi 2: " + sub_s2);

        if(s1.length() < 6){
            System.out.println("Khong co ki tu thu 6");
        }
        else{
            System.out.println("Ki tu thu sau cua chuoi 1: " + s1.charAt(5));
        }

        if(s1.length() == s2.length()){
            System.out.println("2 Chuoi bang nhau");
        }
        else{
            System.out.println("2 Chuoi khong bang nhau");
        };

        if (s1.contains(s2)){
            System.out.println("Vi tri cua chuoi 2 trong chuoi 1 la: " + s1.indexOf(s2));
        }
        else{
            System.out.println("Khong co chuoi 2 trong chuoi 1");
        }
    }
}