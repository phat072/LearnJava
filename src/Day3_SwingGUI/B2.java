package Day3_SwingGUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class B2 {
    public static void saveValuesToFile(Scanner keyboard, int[] numbers) {

        try {
            System.out.println("Name of file: ");
            String fileName = keyboard.next();
            File file = new File(fileName);
            PrintWriter outputFile = new PrintWriter(file);

            for (int number : numbers) {
                outputFile.println(number);
            }

            outputFile.close();


        } catch (FileNotFoundException e) {
            System.out.println("Doesn't exist");
            e.printStackTrace();
        }

    }

    public static void saveValuesToFileStudent(Student[] studentArray) {
        try {
            System.out.println("Name of file: ");
            Scanner keyboard = new Scanner(System.in);
            String fileName = keyboard.nextLine();
            File file = new File(fileName);
            PrintWriter outputFile = new PrintWriter(file);

            // Write the header row
            outputFile.println("StudentID\tName\tClassName\tPoint");

            for (Student student : studentArray) {
                outputFile.println(student.StudentID + "\t" + student.Name + "\t" + student.ClassName + "\t" + student.Point);
            }

            outputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Doesn't exist");
            e.printStackTrace();
        }
    }

    public static void readFromFile(Scanner keyboard, int[] numbers) throws FileNotFoundException {

        System.out.println("Name of file");
        String fileName = keyboard.next();
        BufferedReader reader = null;
        try {
            reader  = new BufferedReader (new FileReader(fileName));
            String input = null;
            int i = 0;
            while ((input = reader.readLine()) != null) {
                numbers[i] = Integer.parseInt(input);
                i++;
            }

            for(int j = 0; j < numbers.length; j++) {
                System.out.println(numbers[j]);
            }
        }
        catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void bai1() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements you want to store: ");
        n=scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            array[i]=scanner.nextInt();
        }
        saveValuesToFile(scanner, array);
        readFromFile(scanner, array);

    }

    public static void bai2() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements you want to store: ");
        n=scanner.nextInt();
        Student[] array = new Student[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            System.out.println("Student " + (i+1));
            array[i] = new Student();  // Initialize the Student object
            System.out.println("ID: " );
            array[i].StudentID = scanner.next();
            System.out.println("Name: " );
            array[i].Name = scanner.next();
            System.out.println("Class: ");
            array[i].ClassName = scanner.next();
            System.out.println("Point: ");
            array[i].Point = scanner.nextInt();
        }

        saveValuesToFileStudent(array);
        // readFromFile(scanner, array);
    }
    public static void main(String[] args) throws FileNotFoundException {
        //bai1();
        bai2();


    }
}