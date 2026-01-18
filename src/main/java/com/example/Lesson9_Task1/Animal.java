package com.example.Lesson9_Task1;

public abstract class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void voice();
    public abstract void eat(String food);

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Животное: " + this.getClass().getSimpleName());
        System.out.println("Имя: " + name);
    }
}
