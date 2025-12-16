package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
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

                    int id = 1;
                    boolean done=true;
                    do {
                        System.out.print("Enter Your name: ");
                        String name = sc.next();
                        System.out.print("Enter Your age: ");
                        int age = sc.nextInt();
                        System.out.print("Enter Your Gender: ");
                        String gender = sc.next().toLowerCase();
                        while (!gender.equals("male") && !gender.equals("female")){
                            System.out.print("Enter Your Gender Again: ");
                            gender = sc.next();
                        }
                        System.out.print("Enter Your Phone Number: ");
                        int phone = sc.nextInt();
                        System.out.println("**********************************");
                        for (Course c : courses){
                            c.diplay();
                        }
                        System.out.println("**********************************");
                        boolean chack=true;
                        String nameMajoring="";
                        int idMajoring=0;
                        do {
                            System.out.print("Enter ID Majoring: ");
                            int idmajor = sc.nextInt();
                            while (idmajor <0 || idmajor >courses.size()){
                                System.out.print("Enter ID Majoring again: ");
                                idmajor = sc.nextInt();
                            }

                            for (Course c : courses){
                                if(c.getCourseID() == idmajor){
                                    chack=false;
                                    idMajoring=idmajor;
                                    nameMajoring= c.Coursename;
                                }
                            }

                        }while(chack);
                        students.add(new Student(nameMajoring, idMajoring, id, name, age, gender, phone));
                        id++;
                        System.out.print("Add student more (y/n): ");
                        String answer = sc.next().toLowerCase();
                        while (!answer.equals("y") && !answer.equals("n")){
                            System.out.print("Enter Your Choice: ");
                            answer = sc.next();
                        }
                        if (answer.equals("y")){
                            done=true;
                        } else if (answer.equals("n")) {
                            done=false;
                        }
                    }while (done);
                }break;
//                add course
                case 2:{
                    int id=1;
                    boolean done=true;
                    do {
                        System.out.println("Add Course");

                        System.out.print("Enter Name Course: ");
                        String name =sc.next();
                        courses.add(new Course(id,name));
                        id++;
                        System.out.print("Add more Courses(y/n):");
                        String n =sc.next().toLowerCase();
                        while (!n.equals("y") && !n.equals("n")){
                            System.out.println("Add Course again: ");
                            n =sc.next().toLowerCase();
                        }
                        if (n.equals("y")){
                            done=true;
                        } else if (n.equals("n")) {
                            done=false;
                        }
                    }while(done);
                }break;
                case 3:{
                    for(Course c : courses){
                        c.diplay();
                    }
                }break;
                case 4:{
                    System.out.println(students.size());
                    for(Student s : students){
                        s.display();
                    }
                }break;
                case 5:{}break;
                case 6:{
                    go=false;
                }break;
            };
        }while (go);
    }
}
