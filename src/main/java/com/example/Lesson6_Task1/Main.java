package com.example.Lesson6_Task1;

public class Main {
    public static void main(String[] args) {

        CreditCard Card1 = new CreditCard();
        Card1.cardName = "Card1";
        Card1.accountNumber = 456789;
        Card1.currentSum = 100000;

        CreditCard Card2 = new CreditCard();
        Card2.cardName = "Card2";
        Card2.accountNumber = 67890;
        Card2.currentSum = 742213;

        CreditCard Card3 = new CreditCard();
        Card3.cardName = "Card3";
        Card3.accountNumber = 77777;
        Card3.currentSum = 100;

        Card1.Plus(Card1.currentSum);
        Card2.Plus(Card2.currentSum);
        Card3.Minus(Card3.currentSum);

        Card1.currentInformation();
        Card2.currentInformation();
        Card3.currentInformation();
    }
}
