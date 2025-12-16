package org.example;

import java.util.*;

public class Oop {


//    1.New student


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nameAdmin =  {"meng","admin"};
        String[] passwordAdmin = {"meng123","admin123"};
        LinkedList<Student> student = new LinkedList<>();
        LinkedList<Major> major = new LinkedList<>();
        boolean done = true;
        System.out.println("****************************************");
        System.out.println();
        System.out.println("\tWelcome to SETCE Institute");
        System.out.println();
        System.out.println("****************************************");
//        System.out.println("This my School Management System.");
        while (done){
//            if(major.size() == 0){
//                boolean check = true;
//                do {
//                    int id=1;
//                    System.out.print("Please enter a major name: ");
//                    String majorName = sc.next();
//                    major.add(new Major(id, majorName));
//                    if(major.size() == 1){
//                        System.out.println("Add Major successfully!");
//                        check = false;
//                    }if(major.size() == 0){
//                        System.out.println("Not add Major successfully!");
//                    }
//                }while(check);
//            } else if (major.size() != 0) {
                System.out.println("This my School Management System.");
                System.out.println("1. New Student.");
                System.out.println("2. Add Major.");
                System.out.println("3. Login Admin.");
                System.out.println("4. Exit Program.");
                System.out.print("Please Choose an Option: ");
                int option = sc.nextInt();
                switch (option){
                    case 1:{
                        System.out.print("Please enter the major name: ");
                    }break;
                    case 2:{
                        System.out.print("Please enter the major name: ");
                    }break;
                    case 3:{
                        String username = "";
                        boolean login = true;
                        do {
                            System.out.print("Enter your Name: ");
                            String newName = sc.next().toLowerCase();
                            System.out.print("Please enter your password: ");
                            String newPassword = sc.next().toLowerCase();

                            for (int i = 0; i < 2; i++) {
                                if (nameAdmin[i].equals(newName) && passwordAdmin[i].equals(newPassword)){
                                    login = false;
                                    username = nameAdmin[i];
                                }
                            }

                        }while (login);
                        System.out.println("Login Successful!");
                        System.out.println("Welcome "+username);
                        boolean system = true;
                        do{
                            System.out.println("1.Student");
                            System.out.println("2.Major");
                            System.out.println("3.Display");
                            System.out.println("4.Exit Admin");
                            System.out.print("Please Choose an Option: ");
                            int adminoption = sc.nextInt();
                            switch (adminoption){
                                case 1:{
                                    System.out.println("Please enter your Name: ");
                                }break;
                                case 2:{
                                    System.out.println("Please enter your password: ");
                                }break;
                                case 3:{
                                    System.out.println("Enter your Name: ");
                                }break;
                                case 4:{
                                    system = false;
                                }break;
                            }
                        }while (system);
                    }break;
                    case 4:{
                        done = false;
                    }break;
                }
//            }
        }
        System.out.println("System Program Terminated.");
    }
}
