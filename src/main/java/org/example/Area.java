package org.example;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(),b = sc.nextDouble(),c = sc.nextDouble(), pi = 3.14159;
        double trianguloRetangulo = (a *  c) / 2;
        double circulo = pi * Math.pow(c,2);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;
        System.out.println("TRIANGULO: " + String.format("%.3f", trianguloRetangulo));
        System.out.println("CIRCULO: " + String.format("%.3f", circulo));
        System.out.println("TRAPEZIO: " + String.format("%.3f", trapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", quadrado));
        System.out.println("RETANGULO: " + String.format("%.3f", retangulo));
    }
}
