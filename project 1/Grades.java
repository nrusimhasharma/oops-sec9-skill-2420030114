package ControlStatements;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's marks (0-100): ");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("A+");
        } else if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 70) {
            System.out.println("B");
        } else if (marks >= 60) {
            System.out.println("C");
        } else if (marks >= 50) {
            System.out.println("D");
        } else if (marks >= 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks entered!");
        }

        sc.close();
    }
}
