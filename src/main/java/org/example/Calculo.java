package org.example;

import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {
        double valorCompra = 0;
        Scanner sc =  new Scanner(System.in);
        for (int i = 0; i < 2; i++){
            String compra = sc.nextLine();
            String[] valores = compra.split(" ");
            int quantidade  = Integer.parseInt(valores[1]);
            double preco = Double.parseDouble(valores[2]);
            valorCompra+= quantidade * preco;
        }
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valorCompra));
    }
}
