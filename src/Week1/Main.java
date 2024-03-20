package Week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bai1();
        bai2();
        bai3();

    }

    public static void bai1() {
        System.out.println("Hello world!");
    }

    public static void bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please import n:");
        int n = sc.nextInt();

        System.out.println("Import x:");
        int x = sc.nextInt();

        float Sum = 0;
        int Denominator = 0;
        for(int i = 1; i < n+1; i++){
            Denominator += i;
            Sum += (float) (Math.pow(x, i) / Denominator);
        }

        System.out.print("S(n) = "+ Sum);
    }

    public static void bai3()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ba canh cua tam giac");
        System.out.print("Nhap A, B, C: ");
        String[] sides = scanner.nextLine().split("\\s+");

        float A = Float.parseFloat(sides[0]);
        float B = Float.parseFloat(sides[1]);
        float C = Float.parseFloat(sides[2]);

        if (A + B > C && A + C > B && B + C > A) { // Check triangle inequality
            float cv = A + B + C;
            System.out.println("Chu vi tam giac = " + cv);

            float p = cv / 2;
            float dt = (float) Math.sqrt(p * (p - A) * (p - B) * (p - C));

            System.out.println("Dien tich tam gia = " + dt);
        } else {
            System.out.println("Ba canh vua nhap khong tao thanh mot tam giac.");
        }
    }


}
