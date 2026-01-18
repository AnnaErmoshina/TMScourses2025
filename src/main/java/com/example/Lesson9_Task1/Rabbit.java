package com.example.Lesson9_Task1;

public class Rabbit extends Animal{
    public Rabbit (String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " говорит: Гав-гав!");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Grass")) {
            System.out.println(getName() + " с удовольствием ест траву!");
        } else {
            System.out.println(getName() + " недовольно смотрит на " + food);
        }
    }
}
