package ru.mirea.pract01_var1;

import java.lang.*;

public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a) {
        name = n;
        age = a;
    }

    public Dog(String n) {
        name = n;
        age = 0;
    }

    public Dog(){
        name = "Шарик";
        age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return this.name+", возраст "+this.age;
    }

    public void intoHumanAge(){
        System.out.println("В пересчёте на человеческие года возраст "+name+"а составляет "+age*7+" лет");
    }

}
