package org.example;

import java.util.Scanner;

public class AreaRaio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 3.14159;
        double raio = sc.nextDouble();
        double area = n * (raio * raio);
        System.out.println("A=" + String.format("%.4f",area));
    }
}
