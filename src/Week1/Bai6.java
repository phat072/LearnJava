package Week1;

import java.util.*;

public class Bai6 {

    public static void ImportDay(Calendar a){
        Scanner scanner = new Scanner(System.in);
        int dayA, monthA, yearA;

        System.out.print("Nhap ngay: ");
        dayA = scanner.nextInt();
        a.set(Calendar.DAY_OF_MONTH, dayA);

        System.out.print("Nhap thang: ");
        monthA = scanner.nextInt();
        a.set(Calendar.MONTH, monthA-1);

        System.out.print("Nhap nam: ");
        yearA = scanner.nextInt();
        a.set(Calendar.YEAR, yearA);
    }
    public static void main(String[] args){
        Calendar a = Calendar.getInstance();
        Calendar b = Calendar.getInstance();

        Bai6.ImportDay(a);
        Bai6.ImportDay(b);

        //1
        int i = a.compareTo(b);
        switch(i){
            case 0:
                System.out.println("Cung ngay");
                break;
            case -1:
                System.out.println("Ngay A truoc ngay B");
                break;
            case 1:
                System.out.println("Ngay A sau ngay B");
                break;
        };

        //2
        Calendar PreviousDay;
        PreviousDay = a;
        PreviousDay.add(Calendar.DATE, -1);
        System.out.println("Ngay truoc ngay A la: " + PreviousDay.getTime() );
        a.add(Calendar.DATE, 1);
        System.out.println("Ngay sau ngay A la: " + a.getTime() );

        //3
        System.out.println(a.getTime() + " la ngay thu " + a.get(Calendar.DAY_OF_YEAR) + " cua nam");

        //4
        System.out.println("Co " + a.getActualMaximum(Calendar.DAY_OF_MONTH) + " ngay");

        //5
        if (((a.get(Calendar.YEAR) % 4 == 0) && (a.get(Calendar.YEAR) % 100 != 0)) || (a.get(Calendar.YEAR) % 400 == 0)){
            System.out.println(a.get(Calendar.YEAR) + " la nam nhuan");
        }
        else{
            System.out.println(a.get(Calendar.YEAR) + " khong phai la nam nhuan");
        }
    }
}