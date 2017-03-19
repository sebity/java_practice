package com.jantatham;


import java.util.Scanner;

/**
 * Created by jan on 18/03/17.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");


    public static void main(String[] args) {
//        Gearbox mcLaren = new Gearbox(6);
//
//        mcLaren.operatingClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operatingClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operatingClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operatingClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
