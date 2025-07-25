package org.example;

import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble(), nota2 = sc.nextDouble(), nota3 = sc.nextDouble();
        double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
        System.out.println("MEDIA = " + String.format("%.1f", media));
    }
}
