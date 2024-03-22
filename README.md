# LearnJava

## Day 1 Basic Java Exercises

This repository contains basic Java exercises. Each exercise is contained in its own Java file.

### Main.java

This file contains three methods: `bai1()`, `bai2()`, and `bai3()`. `bai1()` prints "Hello world!". `bai2()` calculates a mathematical sum based on user input. `bai3()` calculates the area and perimeter of a triangle based on user input.

### Bai4.java

This file contains methods to calculate factors of a number, count the number of digits in a number, check if a number is a palindrome, and check if a number is a perfect square.

### Bai5.java

This file contains a program that takes two strings as input and performs various operations on them, such as calculating their combined length, extracting the first three characters, and checking if one string contains the other.

### Bai6.java

This file contains a program that takes two dates as input and performs various operations on them, such as comparing them, calculating the day before and after a date, and checking if a year is a leap year.

### Bai7.java

This file contains a program that takes two arrays as input and performs various operations on them, such as copying elements from one array to another, replacing elements in an array, and sorting an array.

### Bai8.java

This file contains a program that generates a random number within a user-specified range and allows the user to guess the number.

### Bai9.java

This file contains a program that shuffles an array of integers and allows the user to trace a specific integer through the shuffled array.

## How to Run

To run any of these programs, compile the Java file using a Java compiler and then run the compiled class file. For example, to run `Main.java`, use the following commands:

```bash
javac Main.java
java Main # compile the Java file
```

Replace `Main` with the name of the file you want to run.

## Day 2 Object-Oriented Programming (OOP) Java Exercises

This repository contains Java exercises that demonstrate the principles of Object-Oriented Programming (OOP). Each exercise is contained in its own Java file.

### Quiz1.java

This file contains several classes (`point`, `Fraction`, `Triangle`, `Rectangle`, `Square`, `Circle`) that demonstrate the use of constructors, methods, and properties. Each class has methods for calculating various properties (like perimeter, area, etc.) and for inputting and outputting data.

### Quiz2.java

This file contains a `Student` class that implements the `Comparable` interface. It also contains a main method that creates an array of `Student` objects, inputs data for each student, and performs various operations on the array, such as listing students who achieve scholarships, listing students with the highest average score, and listing the top 10 students with the highest average score.

### Student.java

This file contains a `Student` class that implements the `Comparable` interface. The class has properties for student ID, student name, math score, physics score, programming intro score, and average score. It also has methods for inputting student data, calculating the average score, and outputting student data.

## How to Run

To run any of these programs, compile the Java file using a Java compiler and then run the compiled class file. For example, to run `Quiz1.java`, use the following commands:

```bash
javac Quiz1.java
java Quiz1
```

Replace `Quiz1` with the name of the file you want to run.

## Day 3 Swing GUI Java Exercises

This repository contains Java exercises that demonstrate the use of Swing GUI in Java. Each exercise is contained in its own Java file.

### Register.java

This file contains a `Register` class that extends `javax.swing.JFrame`. The class demonstrates the use of various Swing components such as `JLabel`, `JTextField`, `JTextArea`, `JComboBox`, `JList`, `JRadioButton`, `JButton`, `JPanel`, `JScrollPane`, and `ButtonGroup`.

The `Register` class includes a `main` method that sets the look and feel of the UI to "Nimbus" and makes a new `Register` frame visible.

The `initComponents` method initializes all the Swing components and sets their properties. It also adds action listeners to some of the components.

The `btnOkActionPerformed` method checks if all the fields are filled and shows a success message if they are, or an error message if they aren't.

The `btnCloseActionPerformed` method closes the application.

