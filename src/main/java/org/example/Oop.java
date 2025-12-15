package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Oop {


//    1.New student


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        data
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

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
//                New Student
                case 1:{
                    ArrayList<Course> newCourses = new ArrayList<>();
                    int id = 1;
                    int qty =0;
                    boolean done=true;
                    do {
                        System.out.print("Enter Your name: ");
                        String name = sc.next();
                        System.out.print("Enter Your age: ");
                        int age = sc.nextInt();
                        System.out.print("Enter Your Gender: ");
                        String gender = sc.next();
                        System.out.print("Enter Your Phone Number: ");
                        int phone = sc.nextInt();
                        for (Course c : courses){
                            if(c.getCourseqty()==40){
                                c.diplay();
                                System.out.println("Full😱");
                            } else if (c.getCourseqty()>40) {
                                c.diplay();
                            }
                        }
                        System.out.println("**********************************");
                        System.out.print("Enter Your Course(ID): ");
                        int course =sc.nextInt();
                        while (course < 1 || course > courses.size()){
                            System.out.println("Invalid Course");
                            System.out.print("Enter Your Course(ID) again: ");
                            course =sc.nextInt();
                        }
                        for (Course c : courses){
                            if(c.getCourseID()==course){
                                newCourses.add(c);
                                qty++;
                                students.add(new Student(c.getCoursename(),c.getCourseID(),qty,id, name, age, gender, phone));
                            }
                        }
                        newCourses.clone();


                        id++;

                    }while (done);
                }break;
                case 2:{}break;
                case 3:{}break;
                case 4:{}break;
                case 5:{}break;
                case 6:{
                    go=false;
                }break;
            };
        }while (go);
    }
}
