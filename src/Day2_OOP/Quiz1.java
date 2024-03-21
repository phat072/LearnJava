package Day2_OOP;

import java.util.*;

public class Quiz1 {
    static Scanner sc = new Scanner(System.in);
    public static class point{
        int x;
        int y;

        public point(int x, int y){
            this.x = x;
            this.y = y;
        }

        public point(){
            return;
        }

        public void input(){
            System.out.println("Enter x, y:");
            this.x = sc.nextInt();
            this.y = sc.nextInt();
        }

        public double get_Range(point B){
            return Math.sqrt(Math.abs(this.x - B.x)*Math.abs(this.x - B.x) +  Math.abs(this.y - B.y)*Math.abs(this.y - B.y));
        }
    }

    public static class Fraction{
        int numerator;
        int denominator;


        public Fraction(int numerator, int denominator){
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public Fraction() {
            return;
        }


        public void input(){
            System.out.println("Enter numerator and denominator:");
            this.numerator = sc.nextInt();
            this.denominator = sc.nextInt();
        }


        public void simplify(){
            int a = this.numerator;
            int b = this.denominator;
            while(a != b){
                if(a>b){
                    a -= b;
                }
                else{
                    b -= a;
                }
            }

            this.numerator /= a;
            this.denominator /= a;
        }



        public Fraction sum(Fraction B){
            Fraction sumFraction = new Fraction(0, 1);
            sumFraction.numerator = this.numerator * B.denominator + this.denominator * B.numerator;
            sumFraction.denominator = this.denominator * B.denominator;
            sumFraction.simplify();
            return sumFraction;
        }

        public Fraction sub(Fraction B){
            Fraction subFraction = new Fraction(0, 1);
            subFraction.numerator = this.numerator * B.denominator - this.denominator * B.numerator;
            subFraction.denominator = this.denominator * B.denominator;
            return subFraction;
        }

        public Fraction multiply(Fraction B){
            Fraction multiplyFraction = new Fraction(0, 1);
            multiplyFraction.numerator = this.numerator * B.numerator;
            multiplyFraction.denominator = this.denominator * B.denominator;
            multiplyFraction.simplify();
            return multiplyFraction;
        }

        public Fraction divide(Fraction B){
            Fraction divideFraction = new Fraction(0, 1);
            divideFraction.numerator = this.numerator * B.denominator;
            divideFraction.denominator = this.denominator * B.numerator;
            divideFraction.simplify();
            return divideFraction;

        }
    }

    public static class Triangle{
        double a;
        double b;
        double c;

        public Triangle(double a, double b, double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public Triangle(){
            return;
        }

        public void input(){

            System.out.println("Enter sides:");
            this.a = sc.nextDouble();
            this.b = sc.nextDouble();
            this.c = sc.nextDouble();

            do{
                System.out.println("Invalid triangle, please check again.");
                this.a = sc.nextDouble();
                this.b = sc.nextDouble();
                this.c = sc.nextDouble();
            }
            while(this.a + this.b > this.c || this.a + this.c > this.b || this.b + this.c > this.a);
        }

        public double perimeter(){
            return this.a + this.b + this.c;
        }

        public double area(){
            double p = (this.a + this.b + this.c)/2;
            return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
        }

        public void output(){
            System.out.println("this triangle");
            System.out.printf("sides: " + this.a + ", " + this.b + ", ", this.c);
            System.out.println("perimeter: " + perimeter());
            System.out.println("area: " + area());
        }
    }

    public static class Rectangle{
        double a;
        double b;

        public Rectangle(double a, double b){
            this.a = a;
            this.b = b;
        }

        public Rectangle(){
            return;
        }


        public void input(){

            System.out.println("Enter sides: ");
            this.a = sc.nextDouble();
            this.b = sc.nextDouble();

        }

        public double perimeter(){
            return (a+b)*2;
        }

        public double area (){
            return a*b;
        }

        public void output(){
            System.out.println("============Rectangle============");
            System.out.println("sides: " + this.a + ", " + this.b);
            System.out.println("perimeter: " + perimeter());
            System.out.println("area: " + area());
        }
    }

    public static class Square{
        double a;

        public Square(double a){
            this.a = a;
        }

        public Square(){
            return;
        }

        public void input(){

            System.out.println("Enter side: ");
            this.a = sc.nextDouble();

        }

        public double perimeter(){
            return a*4;
        }

        public double area (){
            return a*a;
        }

        public void output(){
            System.out.println("============Square============");
            System.out.println("sides: " + this.a );
            System.out.println("perimeter: " + perimeter());
            System.out.println("area: " + area());
        }
    }

    public static class Circle{
        double r;

        public Circle(double r){
            this.r = r;
        }

        public Circle(){
            return;
        }

        public void input(){

            System.out.println("Enter radius: ");
            this.r = sc.nextDouble();

        }

        public double perimeter(){
            return 2*r*3.14;
        }

        public double area(){
            return 3.14*r*r;
        }

        public void output(){
            System.out.println("============Circle============");
            System.out.println("radius: " + this.r);
            System.out.println("perimeter: " + perimeter());
            System.out.println("area: " + area());
        }
        public static void main(String[] args){
            //use input() method if you want to input object attributes

            point A = new point(2, 3);
            point B = new point(8, 6);

            System.out.println("The range from point A to B is: " + A.get_Range(B));
            System.out.println("Input point A: ");
            A.input();
            System.out.println("Input point B: ");
            B.input();
            System.out.println("The range from point A to B is: " + A.get_Range(B));

            Fraction a = new Fraction(2,3);
            Fraction b = new Fraction(5,7);
            Fraction result = a.sum(b);
            System.out.println("Sum of 2 fraction: " + result.numerator + "/" + result.denominator);

            Fraction Fr1 = new Fraction();
            Fr1.input();
            Fraction Fr2 = new Fraction();
            Fr2.input();


            result = a.sub(b);
            System.out.println("Subtract of 2 fraction: " + result.numerator + "/" + result.denominator);

            result = a.multiply(b);
            System.out.println("Multiply of 2 fraction: " + result.numerator + "/" + result.denominator);

            result = a.divide(b);
            System.out.println("Division of 2 fraction: " +result.numerator + "/" + result.denominator);

            Rectangle r = new Rectangle();
            r.input();
            r.output();

            Circle c = new Circle();
            c.input();
            c.output();

            Square s = new Square();
            s.input();
            s.output();

            Triangle t = new Triangle();
            t.input();
            t.output();

        }
    }
}