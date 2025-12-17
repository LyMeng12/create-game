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
//        System.out.println("This my School Management System.");
        while (done){
            System.out.println("****************************************");
                System.out.println("This my School Management System.");
                System.out.println("1. New Student.");
                System.out.println("2. Add Major.");
                System.out.println("3. Login Admin.");
                System.out.println("4. Exit Program.");
                System.out.print("Please Choose an Option: ");
                int option = sc.nextInt();
                switch (option){
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
                            m.Display();
                        }
                        System.out.println("Choose Major:");
                        int majorId = sc.nextInt();
                        for(Major m : major){
                            if(majorId==m.getMajorID()){
                                students.add(new Student(m.getMajorID(),m.getMajorName(),id,name,gender,age,phone));
                            }
                        }

                    }break;
                    case 2:{
                        System.out.println("********************************");
                        for (Major m : major){
                            m.Display();
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
                            System.out.println("Welcome Admin "+username+ " 🦦");
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
                                    boolean match = true;
                                    do {
                                        System.out.println("This is a Major");
                                        System.out.println("1.Add Major");
                                        System.out.println("2.Edit Major");
                                        System.out.println("3.Delete Major");
                                        System.out.println("4.Exit");
                                        System.out.print("Please Choose an Option: ");
                                        int choose = sc.nextInt();
                                        switch (choose){
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
                                                                checkmajorname = true; // duplicate found
                                                                System.out.println("Major name already exists! Please enter again.");
                                                                break;
                                                            }
                                                        }

                                                        if (!checkmajorname) {
                                                            namemajor = name; // valid name
                                                        }
                                                    }
                                                }while (checkmajorname);
                                                major.add(new Major(idmajor,namemajor));
                                            }break;
                                            case 2:{
                                                for (Major maj : major) {
                                                    maj.Display();
                                                }
                                            }break;
                                            case 3:{}break;
                                            case 4:{
                                                match = false;
                                            }break;
                                        }
                                    }while (match);

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
