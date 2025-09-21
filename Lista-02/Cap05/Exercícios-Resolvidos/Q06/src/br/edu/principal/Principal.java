package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalVista = 0;
        double totalPrazo = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.println("Transação " + i);
            System.out.print("Digite o código (V para à vista, P para a prazo): ");
            String codigo = sc.next().toUpperCase();

            System.out.print("Digite o valor da transação: ");
            double valor = sc.nextDouble();

            if (codigo.equals("V")) {
                totalVista += valor;
            } else if (codigo.equals("P")) {
                totalPrazo += valor;
            } else {
                System.out.println("Código inválido! Transação ignorada.");
                i--;
            }
        }

        double totalCompras = totalVista + totalPrazo;
        double primeiraPrestacao = totalPrazo / 3;

        System.out.println("\nResumo das transações:");
        System.out.println("Total das compras à vista: R$ " + totalVista);
        System.out.println("Total das compras a prazo: R$ " + totalPrazo);
        System.out.println("Total das compras efetuadas: R$ " + totalCompras);
        System.out.println("Valor da primeira prestação das compras a prazo: R$ " + primeiraPrestacao);
    }
}
