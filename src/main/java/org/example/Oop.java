package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Oop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        boolean go=true;
        do {
            System.out.println("**********************************************");
            System.out.println();
            System.out.println("Welcome to Student Management SETEC INSTITUTE");
            System.out.println();
            System.out.println("**********************************************");
            System.out.println("\tThis is a student management System");
            System.out.println("1.New Student");
            System.out.println("2.Add Course");
            System.out.println("3.Register students for courses");
            System.out.println("4.Show list of students in the subject");
            System.out.println("5.Remove students from courses");
            System.out.println("6.Exit");
            System.out.print("Choose an option: ");
            int choose = sc.nextInt();
            switch (choose){

            };
        }while (go);
    }
}
