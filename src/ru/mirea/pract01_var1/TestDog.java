package ru.mirea.pract01_var1;

import java.lang.*;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Тузик", 2);
        Dog d2 = new Dog("Бобик", 7);
        Dog d3 = new Dog("Палкан");

        d3.setAge(13);

        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
