package Day1_basic;

import java.util.Scanner;

public class Bai4 {
    public static void UocSo(int n){
        System.out.println("Uoc so cua n:");
        for(int i = 1; i<n/2; i++){
            if(n%i ==0){
                System.out.println(i);
            }
        }
    }

    public static int ChuSo(int n){
        String string_of_n = String.valueOf(n);
        return string_of_n.length();
    }

    public static boolean DoiXung(int n){
        String string_of_n = String.valueOf(n);

        for(int i=1; i<string_of_n.length(); i++){
            if(string_of_n.charAt(i-1) != string_of_n.charAt(string_of_n.length()-i)){
                return false;
            }
        }
        return true;
    }

    public static boolean ChinhPhuong(int n){

        int loop = 1;
        while(loop < n){
            if (loop*loop == n){
                return false;
            }
            loop += 1;
        }

        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap n:");
        n =sc.nextInt();

        Bai4.UocSo(n);

        System.out.println(n + " co " + Bai4.ChuSo(n) + " chu so");

        if(Bai4.DoiXung(n))
        {System.out.println(n + " la so doi xung");}
        else
        {System.out.println(n + " khong phai so doi xung");}


        if (Bai4.ChinhPhuong(n)){
            System.out.println(n + " la so chinh phuong");
        }
        else{
            System.out.println(n + " khong la so chinh phuong");
        }
    }

}