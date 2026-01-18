package com.example.Lesson9_Task1;

public class Tiger extends Animal{
    public Tiger (String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " говорит: Ppppppp!");
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
