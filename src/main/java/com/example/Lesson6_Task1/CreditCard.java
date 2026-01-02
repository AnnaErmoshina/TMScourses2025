package com.example.Lesson6_Task1;

import java.util.Scanner;

public class CreditCard {
    public String cardName;
    public int accountNumber;
    public int currentSum;

    public CreditCard() {

    }

    public void currentInformation(){
        System.out.println("Current information about your credit card " + cardName + " : ");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Summa: " + currentSum);
    }

    int Plus (int currentSum){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sum for plus " + cardName + " : ");
        int plusSum = scanner.nextInt();

        this.currentSum= currentSum + plusSum;
        System.out.println("New current sum in " + cardName +  " : " + this.currentSum);
        return this.currentSum;
    }

    int Minus (int currentSum){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sum for minus: ");
        int minusSum = scanner.nextInt();

        this.currentSum= currentSum - minusSum;
        System.out.println("New current sum in " + cardName +  " : " + this.currentSum);
        return this.currentSum;
    }
}
