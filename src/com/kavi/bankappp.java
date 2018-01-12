package com.kavi;

import java.util.Scanner;

public class bankappp {

    public static void main(String[] args) {

        int choice = 0;
        double deposit, withdraw, exit;
        double a, b;
        double amount = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; choice != 3; i++) {
            System.out.println("main menu");
            System.out.println("1.deposit");
            System.out.println("2.withdraw");
            System.out.println("3.exit");
            System.out.println("enter your choice");
            choice = sc.nextInt();
            if (choice==1) {

                System.out.println("enter your deposit ");
                a = sc.nextDouble();
                amount += a;
                System.out.println("the current amount is=" + amount);
            }
            else if(choice==2) {
                System.out.println("the current amount is=" + amount);
                System.out.println("enter the withdrawl amount");
                b = sc.nextDouble();
                amount = amount - b;
                System.out.println("balance is= " + amount);
            }
            else{
                System.out.println("exit");
            }

        }
    }
}








