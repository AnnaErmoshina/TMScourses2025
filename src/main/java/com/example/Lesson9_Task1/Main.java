package com.example.Lesson9_Task1;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Бобик");
        Animal tiger = new Tiger("Шерхан");
        Animal rabbit = new Rabbit("Пушистик");

        Animal[] zoo = {dog, tiger, rabbit};

        System.out.println("Информация о животных");
        for (Animal animal : zoo) {
            animal.printInfo();
            animal.voice();
            System.out.println();
        }

        System.out.println("Кормление животных");

        System.out.println("\nКормим собаку");
        dog.eat("Meat");
        dog.eat("Grass");

        System.out.println("\nКормим тигра");
        tiger.eat("Meat");
        tiger.eat("Grass");

        System.out.println("\nКормим кролика");
        rabbit.eat("Grass");
        rabbit.eat("Meat");
    }
}
