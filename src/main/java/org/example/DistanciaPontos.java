package org.example;

import java.util.Scanner;

public class DistanciaPontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers1 = sc.nextLine(), numbers2 = sc.nextLine();
        String[] listNumbers = numbers1.split(" ");
        String[] listNumbers2 = numbers2.split(" ");
        double x1 = Double.parseDouble(listNumbers[0]);
        double y1 = Double.parseDouble(listNumbers[1]);
        double x2 = Double.parseDouble(listNumbers2[0]);
        double y2 = Double.parseDouble(listNumbers2[1]);
        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.printf("%.4f%n", distance);
    }
}
