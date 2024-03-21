package Day1;

import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap kich thuoc cua mang A: ");
            n=scanner.nextInt();
        } while (n<1);

        int [] A= new int[n];
        System.out.println("Nhap cac phan tu cua mang A: ");

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu A["+i+"] cua mang la: ");
            A[i]=scanner.nextInt();
        }

        System.out.println("Mang A la: ");
        for (int i = 0; i < n; i++) {
            System.out.println("A["+i+"] cua mang la: "+ A[i]);
        }

        int m;
        do {
            System.out.println("Nhap kich thuoc cua mang B: ");
            m=scanner.nextInt();
        } while (m<1);

        int [] B= new int[m];
        for (int i = 0; i < m; i++) {
            B[i]=(int)(Math.random()*100);
        }

        System.out.println("Mang B la: ");
        System.out.println(Arrays.toString(B));

        int[]C = Arrays.copyOf(A, n);
        System.out.println("Mang C la: ");
        System.out.println(Arrays.toString(C));

        if(n>=3 && m>3){
            System.arraycopy(B, m - 3, C, 0, 3); // Lay 3 phan tu cuoi cua B ghep vao 3 phan tu dau cua C
            System.out.println("Ket qua sau khi thay the 3 phan tu dau cua C thanh 3 phan tu cuoi cua B la:" );
            System.out.println(Arrays.toString(C));
        }
        else
            System.out.println("Vi kich thuoc khong hop le nen khong the thay the nhau");

        Arrays.sort(C);
        System.out.println("Mang C sau khi duoc sap xep la: ");
        System.out.println(Arrays.toString(C));
    }
}