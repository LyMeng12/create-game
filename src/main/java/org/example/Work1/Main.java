package org.example.Work1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bus> bus = new ArrayList<>();
        ArrayList<Taxi> taxi = new ArrayList<>();
        ArrayList<Train> train = new ArrayList<>();
        boolean done = true;
        System.out.println("*************************************************");
        System.out.println("\tWelcome to the Travel System 🛣️");
        System.out.println("*************************************************");
        do {
            System.out.println("1.Taxi Travel 🚕");
            System.out.println("2.Bus Travel 🚌");
            System.out.println("3.Train Travel 🚄");
            System.out.println("4.Display Travel List 📋");
            System.out.println("5.Update Travel List ✏️");
            System.out.println("6.Exit 🦭");
            System.out.print("your choice: ");
            int choice = sc.nextInt();
            while (choice <0 || choice > 6) {
                System.out.println("Please enter a valid choice");
                System.out.print("your choice again: ");
                choice = sc.nextInt();
            }
            switch (choice) {
//                already
                case 1:{
                    System.out.println("*************************************************");
                    System.out.println("\t Taxi Travel 🚕");
                    double price=0;
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter km: ");
                    double km = sc.nextDouble();
                    double fare;
                    System.out.println("This is a taxi Price: "+(fare= 1+(km*0.5))+"💵");

                    System.out.print("Payment now(y/n): ");
                    String payment = sc.next();
                    while (!payment.equalsIgnoreCase("y") && !payment.equalsIgnoreCase("n")) {
                        System.out.println("Please enter a valid payment");
                        System.out.print("y/n: ");
                        payment = sc.next();
                    }
                    if (payment.equals("y")) {
                        System.out.print("Payment :$");
                        price= sc.nextDouble();
                        while (price!=fare){
                            System.out.print("Payment again:$");
                            price = sc.nextDouble();
                        }
                    } else if (payment.equals("n")) {
                        price = 0;
                    }

                    taxi.add(new Taxi(name, km,fare,price));
                    System.out.println("***********************************************");
                }break;
//                already
                case 2:{
                    System.out.println("*************************************************");
                    System.out.println("\t Bus Travel 🚌");
                    double price=0;
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter km: ");
                    double km = sc.nextDouble();
                    double fare;
                    System.out.println("This is a Bus Price: "+(fare= 3+(km*1))+"💵");
                    System.out.print("Payment now(y/n): ");
                    String payment = sc.next();
                    while (!payment.equalsIgnoreCase("y") && !payment.equalsIgnoreCase("n")) {
                        System.out.println("Please enter a valid payment");
                        System.out.print("y/n: ");
                        payment = sc.next();
                    }
                    if (payment.equals("y")) {
                        System.out.print("Payment :$");
                        price= sc.nextDouble();
                        while (price!=fare){
                            System.out.print("Payment again:$");
                            price = sc.nextDouble();
                        }
                    } else if (payment.equals("n")) {
                        price = 0;
                    }

                    bus.add(new Bus(name, km,fare,price));
                    System.out.println("***********************************************");
                }break;
//                already
                case 3:{
                    System.out.println("*************************************************");
                    System.out.println("\t Train Travel 🚄");
                    double price=0;
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    double km =0;
                    double fare;
                    System.out.println("This is a train Price: "+(fare= 3+(km*0.5))+"💵");
                    System.out.print("Payment now(y/n): ");
                    String payment = sc.next();
                    while (!payment.equalsIgnoreCase("y") && !payment.equalsIgnoreCase("n")) {
                        System.out.print("Please enter a valid payment");
                        System.out.print("y/n: ");
                        payment = sc.next();
                    }
                    if (payment.equals("y")) {
                        System.out.print("Payment :$");
                        price= sc.nextDouble();
                        while (price!=fare){
                            System.out.print("Payment again:$");
                            price = sc.nextDouble();
                        }
                    } else if (payment.equals("n")) {
                        price = 0;
                    }

                    train.add(new Train(name, km,fare,price));
                    System.out.println("***********************************************");
                }break;
//                already
                case 4:{
                    System.out.println("***********************************************");
                    System.out.println("\t Display Travel List 📋");
                    System.out.println("***********************************************");
                    System.out.println("\t Taxi Travel 🚕");
                    for(Taxi t: taxi){
                        t.Display();
                    }
                    System.out.println("***********************************************");
                    System.out.println("\t Bus Travel 🚌");
                    for(Bus b: bus){
                        b.Display();
                    }
                    System.out.println("***********************************************");
                    System.out.println("\t Train Travel 🚄");
                    for(Train t: train){
                        t.Display();
                    }
                    System.out.println("***********************************************");
                }break;
//                done
                case 5:{
                    boolean fand=true;
                    do{
                        System.out.println("*****************************************");
                        System.out.println("\t\t\tEdited Travel 🚕");
                        System.out.println("1.Taxi Travel 🚕");
                        System.out.println("2.Bus Travel 🚌");
                        System.out.println("3.Train Travel 🚄");
                        System.out.println("4.Exit");
                        System.out.print("Enter Choice: ");
                        int number = sc.nextInt();
                        switch(number){
//                            done
                            case 1:{
                                boolean dom = false;
                                System.out.println("*****************************************");
                                System.out.println();
                                System.out.println("This is a Taxi Travel Customer not Payment.");
                                for(Taxi t: taxi){
                                    if(t.Payment().equals("Not Payment")){
                                        t.Display();
                                        dom=true;
                                    }
                                }
                                System.out.println("********************************************");

                                while(dom) {
                                    System.out.print("Choose your name :");
                                    String name = sc.next();
                                    for(Taxi t: taxi){
                                        if (t.name.equals(name)){
                                            System.out.println("You need "+t.Fare+"$");
                                            System.out.print("Payment new: $");
                                            double price=sc.nextDouble();
                                            while (price!=t.Fare){
                                                System.out.print("Payment again:$");
                                                price = sc.nextDouble();
                                            }
                                            t.Price(price);
                                            dom=false;
                                            break;
                                        }
                                    }
                                }
                                if(!dom){
                                    System.out.println("Not have Cusmoer.");
                                }
                            }break;
//                            already
                            case 2:{
                                boolean dom = false;
                                System.out.println("*****************************************");
                                System.out.println();
                                System.out.println("This is a Bus Travel Customer not Payment.");
                                for(Bus t: bus){
                                    if(t.Payment().equals("Not Payment")){
                                        t.Display();
                                        dom=true;
                                    }
                                }
                                System.out.println("********************************************");

                                while(dom) {
                                    System.out.print("Choose your name :");
                                    String name = sc.next();
                                    for(Bus t: bus){
                                        if (t.name.equals(name)){
                                            System.out.println("You need "+t.Fare+"$");
                                            System.out.print("Payment new: $");
                                            double price=sc.nextDouble();
                                            while (price!=t.Fare){
                                                System.out.print("Payment again:$");
                                                price = sc.nextDouble();
                                            }
                                            t.Priec(price);
                                            dom=false;
                                            break;
                                        }
                                    }
                                }
                                if(!dom){
                                    System.out.println("Not have Cusmoer.");
                                }
                            }break;
//                            done
                            case 3:{
                                boolean dom = false;
                                System.out.println("*****************************************");
                                System.out.println();
                                System.out.println("This is a Train Travel Customer not Payment.");
                                for(Train t: train){
                                    if(t.Payment().equals("Not Payment")){
                                        t.Display();
                                        dom=true;
                                    }
                                }
                                System.out.println("********************************************");

                                while(dom) {
                                    System.out.print("Choose your name :");
                                    String name = sc.next();
                                    for(Train t: train){
                                        if (t.name.equals(name)){
                                            System.out.println("You need "+t.Fare+"$");
                                            System.out.print("Payment new: $");
                                            double price=sc.nextDouble();
                                            while (price!=t.Fare){
                                                System.out.print("Payment again:$");
                                                price = sc.nextDouble();
                                            }
                                            t.Price(price);
                                            dom=false;
                                            break;
                                        }
                                    }
                                }
                                if(!dom){
                                    System.out.println("Not have Cusmoer.");
                                }
                            }break;
//                            already
                            case 4:{
                                fand=false;
                            }break;
                        }
                    }while(fand);
                }break;
//                already
                case 6:{
                    done = false;
                }break;
            }
        }while (done);
        System.out.println("\tThank you for using our Travel System 🐳🦭🦦");
    }
}
