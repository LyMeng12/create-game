package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {



    static String[] Ramdo(int place ,int win){
        String[] item = {"🍎","🍊","🍓","🍒","⭐",};
        Random random = new Random();
        String[] row = new String[3];
        for (int i = 0; i < 3; i++) {
            row[i] = item[random.nextInt(item.length)];
        }
        System.out.println("*****************");
        for (int i = 0; i < row.length; i++) {
            System.out.print("| ");
            System.out.print(row[i]+" ");

        }
        System.out.print("|");
        System.out.println();
        System.out.println("*****************");

        display(row,place,win);

        return  row;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How Many$:");
        int meny = in.nextInt();

        boolean play = true ;
        while (play){
            int win = 0;

            System.out.println("Current balance:"+meny+"$");
            System.out.print("Place Your amount:");
            int place = in.nextInt();
            meny = meny - place;
            System.out.println("🍎 🍊 🍓 🍒 ⭐");
            System.out.println("Spinning...");


            Ramdo(place,win);
            meny = meny + win;

            if( meny <= 0){
                System.out.print("You want to play again(y/n):");
                String answer = in.next().toLowerCase();
                while (!answer.equals("y") && !answer.equals("n")){
                    System.out.print("Choose again(y/n):");
                    answer = in.next().toLowerCase();
                }
                if(answer.equals("y")){
                    System.out.print("Input Your Balance:");
                    meny = in.nextInt();
                } else if (answer.equals("n")) {
                    play = false;
                }

            }
        }
        System.out.println("Thank you for play!");

    }
    static void display(String[] row, int place, int win){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            switch(row[row.length-1]){
                case "🍎":
                case "🍊":
                case "🍓":
                case "🍒":
                    place = place * 3;
                    win = place;
                    break;
                case "⭐":
                    place = place * 10;
                    win = place;
                    break;
            }
            System.out.println("You win :" + win + "$");
        }

    }
}