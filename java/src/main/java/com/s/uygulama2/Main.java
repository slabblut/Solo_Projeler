package com.s.uygulama2;


/*
abstract class Shape {

    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println(" Çember çiziliyor.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println(" Dikdörtgen çiziliyor.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }
}
*/


interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println(" Köpek: Hav hav!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println(" Kedi: Miyav!");
    }
}

class Cow implements Animal {
    @Override
    public void makeSound() {
        System.out.println(" İnek: Möö!");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow()
        };

        System.out.println("Hayvanat bahçesi sesleri:");

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}


