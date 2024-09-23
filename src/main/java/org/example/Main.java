package org.example;

import org.example.SubClasses.Circle;
import org.example.SubClasses.Square;
import org.example.SuperClass.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення сторони квадрата:");
        double squareSide = scanner.nextDouble();

        System.out.println("Введіть значення радіуса:");
        double circleRadius = scanner.nextDouble();

        Shape square = new Square(squareSide);
        Shape circle = new Circle(circleRadius);

        System.out.println("Площа квадрата: " + square.getArea());
        System.out.println("Площа кола: " + circle.getArea());

    }
}