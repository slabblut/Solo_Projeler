package com.s.uygulama2;


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

