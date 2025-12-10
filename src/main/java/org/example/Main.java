package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {


    static String[] item(){
        String[] items = {"🍎","🍊","🍓","🍒","⭐"};
        Random random = new Random();
        String[] Row=new String[3];

        for(int i=0;i<3;i++){
            Row[i]=items[random.nextInt(items.length)];
        }
        for(int i=0;i<3;i++){
            System.out.print("| "+Row[i]);
        }
        System.out.print(" |");
        return items;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How Many$:");
        int meny = in.nextInt();

        boolean play = true ;
        while (play){
            System.out.println("Current balance:"+meny);
            System.out.print("Place Your amount:");
            int place = in.nextInt();
            System.out.println("Spinning...");
            System.out.println("*****************");
            System.out.println("🍎 🍊 🍓 🍒 ⭐");
            item();

        }

    }
}