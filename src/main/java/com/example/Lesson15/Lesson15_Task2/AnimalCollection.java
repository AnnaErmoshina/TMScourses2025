package com.example.Lesson15.Lesson15_Task2;

import java.util.LinkedList;

public class AnimalCollection {
    private LinkedList <String> animals;

    public AnimalCollection(){
        animals = new LinkedList<>();
    }

    public void addAnimals (String animalName){
        animals.addFirst(animalName);
        System.out.println("Добавленное животное:" + animalName);
    }

    public String removeAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пустая, нечего удалять");
            return null;
        }

        String removedAnimal = animals.removeLast();
        System.out.println("Удалено животное: " + removedAnimal);
        return removedAnimal;
    }

    public String viewAnimals() {
        if (animals.isEmpty()) {
            return "Коллекция животных пустая";
        }

        StringBuilder result = new StringBuilder("Список животных:\n");
        for (int i = 0; i < animals.size(); i++) {
            result.append(animals.get(i)).append("\n");
        }
        return result.toString();
    }
}
