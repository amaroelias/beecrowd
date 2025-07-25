package org.example;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        double media = ((a * 3.5) + (b * 7.5)) / 11;
        System.out.println("MEDIA = " + String.format("%.5f", media));
    }
}
