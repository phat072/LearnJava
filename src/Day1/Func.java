package Day1;

public class Func {
    int Sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Func test = new Func();
        int a = test.Sum(6, 9);
        System.out.println(a);
    }
}

