package org.example.Work1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Transport> travel = new ArrayList<>();
        boolean done = true;
        System.out.println("*************************************************");
        System.out.println("\tWelcome to the Travel System 🛣️");
        System.out.println("*************************************************");
        do {
            System.out.println("1.Taxi Travel 🚕");
            System.out.println("2.Bus Travel 🚌");
            System.out.println("3.Train Travel 🚄");
            System.out.println("4.Exit");
            System.out.print("your choice: ");
            int choice = sc.nextInt();
            while (choice <0 || choice > 4) {
                System.out.println("Please enter a valid choice");
                System.out.print("your choice again: ");
                choice = sc.nextInt();
            }
            switch (choice) {
//                done
                case 1:{
                    System.out.println("*************************************************");
                    System.out.println("\t Taxi Travel 🚕");
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.println("Enter km: ");
                    double km = sc.nextDouble();
                    System.out.println("Enter price: ");
                    double price = sc.nextDouble();
                    travel.add(new Taxi(name, km, price));
                }break;
//                done
                case 2:{
                    System.out.println("*************************************************");
                    System.out.println("\t Bus Travel 🚌");
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.println("Enter km: ");
                    double km = sc.nextDouble();
                    System.out.println("Enter price: ");
                    double price = sc.nextDouble();
                    travel.add(new Bus(name, km, price));
                }break;
//                done
                case 3:{
                    System.out.println("*************************************************");
                    System.out.println("\t Train Travel 🚄");
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    double km =0;
                    System.out.println("Enter price: ");
                    double price = sc.nextDouble();
                    travel.add(new Taxi(name, km, price));
                }break;
//                already
                case 4:{
                    done = false;
                }break;
            }
        }while (done);
        System.out.println("\tThank you for using our Travel System 🐳🦭🦦");
    }
}
