package com.example.Lesson10_Task1;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("test", "test@mail.com");
        User u2 = new User("test", "test@mail.com");
        User u3 = new User("test", "other@mail.com");

        System.out.println("u1: " + u1);
        System.out.println("u2: " + u2);
        System.out.println("u1 == u2: " + (u1 == u2));
        System.out.println("u1.equals(u2): " + u1.equals(u2));
        System.out.println("u1.equals(u3): " + u1.equals(u3));

        System.out.println("Хэшкод u1 =  " + u1.hashCode());
        System.out.println("Хэшкод u2 =  " + u2.hashCode());
        System.out.println("Хэшкод u3 =  " + u3.hashCode());
    }
}
