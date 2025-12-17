package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] row;


        System.out.print("Input Your Money$:");
        int money = in.nextInt();
        System.out.println("******************************");
        System.out.println("\tWelcome to Java Game.");
        System.out.println("Symbols: 🍒  \uD83D\uDD95 🍊  🥦  🪙");
        System.out.println("******************************");
        boolean again = true;
        while (again) {

            int mony;
            System.out.print("Your Money:"+money+"$");
            System.out.print("Place your money:");
            int payment = in.nextInt();
            money -= payment;
            System.out.println("Spinning...");
            row=Sping();

            mony = getmoney(row,payment);
            if(mony>0){
                System.out.println("You have paid $"+mony);
                money+=mony;
            }


            if (money <= 0) {
                System.out.println("You don't have enough money!");
                System.out.print("You want to play again?(y/n)");
                String answer = in.next();
                while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                    System.out.println("Please enter a valid option!");
                    System.out.print("You want to play again?(y/n)");
                    answer = in.next();
                }
                if (answer.equalsIgnoreCase("y")) {
                    System.out.println("Input Your Money$:");
                    money = in.nextInt();
                } else if (answer.equals("n")) {
                    again = false;
                }
            }

        }
        System.out.println("Game Over!");
    }
    static String[] Sping() {
        String[] play = {"🍒","\uD83D\uDD95","🍊","🥦","🪙",};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = play[random.nextInt(play.length)];
        }
        System.out.println("************************");

        for (int i = 0; i < 3; i++) {
            System.out.print(" | "+row[i]+ " ");
        }
        System.out.print(" |");
        System.out.println();
        System.out.println("************************");
        return row;
    }
    static int getmoney(String[] row, int payment) {
        if(row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]){
                case "🍒" -> payment*3;
                case "\uD83D\uDD95" -> payment*3;
                case "🍊" -> payment*5;
                case "🥦" -> payment*5;
                case "🪙" -> payment*10;
                default -> payment*0;
            };
        }else if(row[0].equals(row[1])) {
            return switch (row[0]){
                case "🍒" -> payment*1;
                case "\uD83D\uDD95" -> payment*1;
                case "🍊" -> payment*3;
                case "🥦" -> payment*3;
                case "🪙" -> payment*5;
                default -> payment*0;
            };
        }else if(row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> payment * 1;
                case "\uD83D\uDD95" -> payment * 1;
                case "🍊" -> payment * 3;
                case "🥦" -> payment * 3;
                case "🪙" -> payment * 5;
                default -> payment * 0;
            };
        }

        return 0;
    }

}