package com.example.Lesson12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite text: ");
        String string = scanner.nextLine();

        Pattern docNumber = Pattern.compile ("[0-9]{4}+\\-+[0-9]{4}+\\-+[0-9]{2}");//+(43)9876543
        Pattern telNumber = Pattern.compile ("\\+\\([0-9]{2}\\)+[0-9]{7}"); //+(xx)xxxxxxx +(43)9876543
        Pattern email = Pattern.compile ("[A-Za-z0-9._%+-]+@[a-z]+\\.+[a-z]{2,6}"); //teachmeskills@gmail.com
        Matcher matcher1 = docNumber.matcher (string);
        Matcher matcher2 = telNumber.matcher (string);
        Matcher matcher3 = email.matcher (string);

        while (matcher1.find()) {
            int start = matcher1.start();
            int end = matcher1.end();
            System.out.println("Document Number: " + string.substring(start,end));
        }
        while (matcher2.find()) {
            int start = matcher2.start();
            int end = matcher2.end();
            System.out.println("Telephone Number: " + string.substring(start,end));
        }
        while (matcher3.find()) {
            int start = matcher3.start();
            int end = matcher3.end();
            System.out.println("Email: " + string.substring(start,end));
        }
    }
}
