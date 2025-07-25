package org.example;

import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int prod = a * b;
        System.out.println("PROD = " + prod);
    }
}
