package org.example;

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double raio = sc.nextDouble(), pi = 3.14159;
        double volume = 4/3.0 * pi * Math.pow(raio, 3);
        System.out.println("VOLUME = " + String.format("%.3f",volume));
    }
}
