package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {



    static int mama(String[] Row,int place){
        if(Row[0].equals(Row[1]) && Row[1].equals(Row[2])){
            return switch (Row[0]){
                case "🍎" -> place *2;
                case "🍊" -> place*3;
                case "🍓" -> place*3;
                case "🍒" -> place*3;
                case "⭐" -> place*10;
                default -> 0;
            };
//            System.out.println("");
        }
        return 0;
    }
    static void diplay(int place){
        String[] items = {"🍎","🍊","🍓","🍒","⭐"};
        Random random = new Random();
        String[] Row=new String[3];

        for(int i=0;i<3;i++){
            Row[i]=items[random.nextInt(items.length)];
        }
        for(int i=0;i<3;i++){
            System.out.print(" "+"| "+Row[i]);
        }
        System.out.print(" |");
        System.out.println();
        mama(Row , place);
        System.out.println("You have"+place);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How Many$:");
        int meny = in.nextInt();

        boolean play = true ;
        while (play){
            System.out.println("Current balance:"+meny+"$");
            System.out.print("Place Your amount:");
            int place = in.nextInt();
            meny = meny - place;
            System.out.println("Spinning...");
            System.out.println("*****************");
            System.out.println("🍎 🍊 🍓 🍒 ⭐");
            diplay(place);
//            meme();
        }

    }
}