package com.example.Lesson9_Task1;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " говорит: Гав-гав!");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println(getName() + " с удовольствием ест мясо!");
        } else {
            System.out.println(getName() + " недовольно смотрит на " + food);
        }
    }
}
