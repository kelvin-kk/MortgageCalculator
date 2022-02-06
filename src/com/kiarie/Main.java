package com.kiarie;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int monthsInYear = 12;

        //Reading Principal
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        long principal = scanner.nextLong();

        //Reading Interest Rate
        System.out.print("Annual Interest Rate: ");
        double interestRate = scanner.nextDouble() ;
        double monthlyInterest = interestRate
                /100            //Convert from Percentage
                / monthsInYear;

        //Reading Period
        System.out.print("Period (Years): ");
        int period = scanner.nextInt() * monthsInYear;
        //Formula
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, period))
                / (Math.pow(1+ monthlyInterest, period) -1);

        //Format to currency before output
        String mortgageValue = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageValue);
    }
}
