package com.example.Lesson15.Lesson15_Task2;

public class Main {
    public static void main (String[] args){
        AnimalCollection animalCollection = new AnimalCollection();

        animalCollection.addAnimals("Лев");
        animalCollection.addAnimals("Слон");
        animalCollection.addAnimals("Тигр");
        animalCollection.addAnimals("Жираф");

        System.out.println("\nТекущее состояние:");
        System.out.println(animalCollection.viewAnimals());

        animalCollection.removeAnimal();
        animalCollection.removeAnimal();

        animalCollection.addAnimals("Зебра");
        animalCollection.addAnimals("Обезьяна");

        System.out.println("\nТекущее состояние:");
        System.out.println(animalCollection.viewAnimals());
    }
}
