package org.example;

import java.util.*;

public class Oop {


//    1.New student


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nameAdmin =  {"meng","admin"};
        String[] passwordAdmin = {"meng123","admin123"};
        ArrayList<Student> students = new ArrayList<>();
        LinkedList<Major> major = new LinkedList<>();
        boolean done = true;
        System.out.println("****************************************");
        System.out.println();
        System.out.println("\tWelcome to SETCE Institute");
        System.out.println();
        System.out.println("****************************************");
        while (done){
                System.out.println("****************************************");
                System.out.println("\tThis my School Management System.");
                System.out.println("1. New Student 🧑‍🎓");
                System.out.println("2. Major 📋");
                System.out.println("3. Login Admin 🔒");
                System.out.println("4. Exit Program ❌");
                System.out.print("Please Choose an Option: ");
                int option = sc.nextInt();
                switch (option){
//                    already
                    case 1:{
                        int id =1;
                        for (int i = 0; i < students.size(); i++){
                            id++;
                        }
                        System.out.print("Please enter the Student name: ");
                        String name = sc.next();
                        System.out.print("Please enter the Student Gender: ");
                        String gender = sc.next();
                        while (!gender.equals("male") && !gender.equals("female")){
                            System.out.print("Please enter again the Student Gender: ");
                            gender = sc.next();
                        }
                        System.out.print("Please enter the Student Age: ");
                        int age = sc.nextInt();
                        System.out.print("Please enter the Student Phone Number: ");
                        String phone = sc.next();
                        System.out.println("This is My Major Student");

                        for(Major m : major){
                            m.DisplayNew();
                        }
                        System.out.print("Choose Major:");
                        int majorId = sc.nextInt();
                        for(Major m : major){
                            if(majorId==m.getMajorID()){
                                students.add(new Student(m.getMajorID(),m.getMajorName(),id,name,gender,age,phone));
                            }
                        }

                    }break;
//                    done
                    case 2:{
                        System.out.println("********************************");

                        for (Major m : major){
                            m.Display();
                            int count =0;
                            for (Student s : students){
                                if(s.getMajorName().equals(m.getMajorName())){
                                    count++;
                                }

                            }
                            System.out.print(" Qty: "+count);
                            System.out.println();
                        }
                        System.out.println("********************************");
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

                        boolean system = true;
                        do{
                            System.out.println("****************************************");
                            System.out.println("\tWelcome Admin "+username.toUpperCase()+ " 🦦");
                            System.out.println("1.Student 🧑‍🎓");
                            System.out.println("2.Major 📍");
                            System.out.println("3.Display 📋");
                            System.out.println("4.Exit Admin ⬅️");
                            System.out.print("Please Choose an Option: ");
                            int adminoption = sc.nextInt();
                            switch (adminoption){
//                                done
                                case 1:{
                                    boolean student = true;
                                    do{
                                        System.out.println("****************************************");
                                        System.out.println(" \tThis is a Student 🧑‍🎓");
                                        System.out.println("1.Student Display 📋");
                                        System.out.println("2.Edite Student ✏️");
                                        System.out.println("3.delete Student 🗑️");
                                        System.out.println("4.Exit");
                                        System.out.print("Please Choose an Option: ");
                                        adminoption = sc.nextInt();
                                        switch (adminoption){
//                                            already
                                            case 1:{
                                                System.out.println("\tStudent Display 📋");
                                                System.out.println("****************************************");
                                                for (Student s : students){
                                                    s.diplayStudent();
                                                }
                                            }break;
//                                            done  test
                                            case 2:{
                                                System.out.println("\tStudent Display 📋");
                                                System.out.println("****************************************");
                                                for (Student s : students){
                                                    s.diplayStudent();
                                                }
                                                System.out.println("****************************************");
                                                System.out.print("Enter ID Student you want to Edite: ");
                                                System.out.println();
                                                int id = sc.nextInt();
                                                for (Student s : students){
                                                    if (s.getID()==id){
                                                        System.out.print("Please enter the Student name: ");
                                                        String name = sc.next();
                                                        System.out.print("Please enter the Student Gender: ");
                                                        String gender = sc.next();
                                                        while (!gender.equals("male") && !gender.equals("female")){
                                                            System.out.print("Please enter again the Student Gender: ");
                                                            gender = sc.next();
                                                        }
                                                        System.out.print("Please enter the Student Age: ");
                                                        int age = sc.nextInt();
                                                        System.out.print("Please enter the Student Phone Number: ");
                                                        String phone = sc.next();
                                                        System.out.println("This is My Major Student");
                                                        String namemajor = "";

                                                        for(Major m : major){
                                                            m.DisplayNew();
                                                        }
                                                        System.out.print("Choose Major:");
                                                        int majorId = sc.nextInt();
                                                        for(Major m : major){
                                                            if(majorId==m.getMajorID()){
                                                                namemajor = m.getMajorName();
                                                            }
                                                        }
                                                        s.SetStudent(name,gender,age,phone,majorId,namemajor);
                                                    }
                                                }
                                            }break;
//                                            already
                                            case 3:{
                                                System.out.println("\tStudent Delete 📋");
                                                System.out.println("****************************************");
                                                for(Student s : students){
                                                    s.diplayStudent();
                                                }
                                                System.out.println("****************************************");
                                                int id;
                                                boolean studentdelete=true;
                                                int ind=0;
                                                do{
                                                    System.out.print("Enter Id You want to delete: ");
                                                    id = sc.nextInt();
                                                    for (Student s : students){
                                                        if(s.getID()==id){
                                                            studentdelete=false;
                                                            break;
                                                        }
                                                        ind++;
                                                    }

                                                }while (studentdelete);
                                                students.remove(ind);
                                                for(Student s : students){
                                                    if(s.getID()>id){
                                                        s.SetID(id++);
                                                    }
                                                }
                                            }break;
//                                            already
                                            case 4:{
                                                student=false;
                                            }break;
                                        }
                                    }while (student);

                                }break;
//                                already
                                case 2:{
                                    boolean match = true;
                                    do {
                                        System.out.println("****************************************");
                                        System.out.println("\tThis is a Major");
                                        System.out.println("1.Add Major ➕");
                                        System.out.println("2.Display Major 📋");
                                        System.out.println("3.Delete Major ✖️");
                                        System.out.println("4.Edit major 🔄️");
                                        System.out.println("5.Exit ⬅️");
                                        System.out.print("Please Choose an Option: ");
                                        int choose = sc.nextInt();
                                        switch (choose){
//                                            already
                                            case 1:{
                                                int idmajor = 1;
                                                for (int i = 0; i < major.size(); i++){
                                                    idmajor++;
                                                }
                                                String namemajor="";
                                                boolean checkmajorname = true;
                                                do {
                                                    System.out.print("Please enter the Major Name: ");
                                                    String name = sc.next().toUpperCase();

                                                    if (major.size()==0){
                                                        checkmajorname = false;
                                                        namemajor=name;

                                                    }if (major.size()!=0){
                                                        checkmajorname = false;
                                                        for (Major maj : major) {
                                                            if (maj.getMajorName().equalsIgnoreCase(name)) {
                                                                checkmajorname = true;
                                                                System.out.println("Major name already exists! Please enter again.");
                                                                break;
                                                            }
                                                        }

                                                        if (!checkmajorname) {
                                                            namemajor = name;
                                                        }
                                                    }
                                                }while (checkmajorname);
                                                major.add(new Major(idmajor,namemajor));
                                            }break;
//                                            already
                                            case 2:{
                                                System.out.println("Display Major <UNK>");
                                                for (Major maj : major) {
                                                    maj.Display();
                                                    System.out.println();
                                                }
                                            }break;
//                                            already
                                            case 3:{
                                                System.out.println("\tThis is a Display Major 📋");
                                                for(Major maj : major){
                                                    maj.Display();
                                                    System.out.println();
                                                }
                                                System.out.println("*****************************");
                                                boolean check = true;
                                                int inr;
                                                do {
//                                                    int index = 0;
                                                    System.out.print("Enter name major you want to delete🗑️: ");
                                                    inr = sc.nextInt();
                                                    for (Major maj : major) {
                                                        if (maj.getMajorID()==inr) {
                                                            check = false;
                                                            break;
                                                        }
//                                                        index++;
                                                    }
//                                                    inr=index;
                                                }while (check);
                                                major.remove(inr);
                                                for(Major maj : major){
                                                    if(maj.getMajorID()>inr){
                                                        maj.SetMajorID(inr++);
                                                    }
                                                }

                                            }break;
//                                            already
                                            case 4:{
                                                boolean check = true;
                                                do {
                                                    System.out.print("Enter ID to Edited Major ✏️:");
                                                    int id = sc.nextInt();
                                                    for (Major maj : major) {
                                                        if (maj.getMajorID()==id) {
                                                            System.out.print("Enter new name: ");
                                                            String name = sc.next().toUpperCase();
                                                            maj.setMajorName(name);
                                                            check = false;
                                                            break;
                                                        }
                                                    }
                                                }while (check);
                                            }break;
//                                            already
                                            case 5:{
                                                match = false;
                                            }break;
                                        }
                                    }while (match);
//                                done
                                }break;
//                                already
                                case 3:{
                                    System.out.println("\tDisplay Major 📋");
                                    System.out.println("**********************************************************");
                                    for(Major maj : major){
                                        maj.Display();
                                        System.out.println();
                                    }
                                    System.out.println("\tDiplay Student 🧑‍🎓");
                                    System.out.println("**********************************************************");
                                    for (Student s : students) {
                                        s.diplayStudent();
                                    }
                                }break;
//                                already
                                case 4:{
                                    system = false;
                                }break;
                            }
                        }while (system);
                    }break;
//                    already
                    case 4:{
                        done = false;
                    }break;
                }
        }
        System.out.println("System Program Terminated.");
    }
}
