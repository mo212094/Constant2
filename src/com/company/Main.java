package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        final double vat = 0.20;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price:");
        int cash = input.nextInt();
        System.out.println("£" + cash + (cash * vat));
        System.out.println("Do you want to do it again? Type yes or no exactly.");
        String again = input.nextLine();

    }
}
