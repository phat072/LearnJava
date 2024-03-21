package Week1;

import java.util.*;

public class Bai8 {
    public static int PickRandom(int n){
        Random rand = new Random();
        return rand.nextInt(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap khoang: ");
        int n = sc.nextInt();
        System.out.println(n);
        int result = Bai8.PickRandom(n);
        int min = 0;
        int max = n;
        int number;

        do{
            System.out.println("("+min+","+max+")"+" ?");
            System.out.print("Doan: ");
            number = sc.nextInt();
            if(number == result){
                System.out.println("Bingo");
                break;
            }else{
                if(number == min){
                    System.out.println("Too small");
                    min = number+1;
                }else{
                    if(number == max){
                        System.out.println("Too large");
                        max = number - 1;
                    }else{
                        if(number > min && (number - min > max - number) && (result - min > max - result) && (number +1<max)){
                            System.out.println("Too small");
                            min = number + 1;
                        }else{
                            System.out.println("Too large");
                            max = number - 1;
                        }
                    }
                }
            }
        }while(max-min!=0);
        if(max-min==0){
            System.out.println("Loser!");
        }
    }
}