package Day1;

import java.util.Scanner;

class Stack {
    private static int[] stack;
    private static int head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());
        createStack(size);
        String operations;
        operations = sc.nextLine();

        while(!(operations.equals("end"))) {
            switch (operations) {
                case "peek" -> System.out.println(peek());
                case "pop" -> pop();
                case "print" -> System.out.print(print());
                default -> {
                    String[] entrant = operations.split(" ");
                    push(Integer.parseInt(entrant[1]));
                }
            }
            operations = sc.nextLine();
        }
    }

    public static void createStack(int size) {
        stack = new int[size];
        head = -1;
    }

    public static boolean isEmpty() {
        return head == -1;
    }

    public static boolean isFull() {
        return head == (stack.length-1);
    }

    public static String print() {
        if(isEmpty()) {
            return "empty\n" ;
        }
        String content = "";
        for(int i = 0; i <= head; i++) {
            content += stack[i] + " ";
        }
        return content.trim() + "\n";
    }

    public static String peek() {
        if(isEmpty()) {
            return "empty";
        }
        String exit = "";
        exit += stack[head];
        return exit;
    }

    public static void push(int n) {
        if(isFull()) {
            System.out.println("full");
        } else {
            head++;
            stack[head] = n;
        }
    }

    public static void pop() {
        if(isEmpty()) {
            System.out.println("empty");
        } else {
            head--;
        }
    }

}