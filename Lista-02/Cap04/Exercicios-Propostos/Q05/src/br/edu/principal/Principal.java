package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, r;
        int op;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Média");
        System.out.println("2 - Diferença");
        System.out.println("3 - Produto");
        System.out.println("4 - Divisão");
        op = sc.nextInt();

        if (op == 1) {
            r = (n1 + n2) / 2;
            System.out.println("Média: " + r);
        } else if (op == 2) {
            if (n1 > n2) {
                r = n1 - n2;
            } else {
                r = n2 - n1;
            }
            System.out.println("Diferença: " + r);
        } else if (op == 3) {
            r = n1 * n2;
            System.out.println("Produto: " + r);
        } else if (op == 4) {
            if (n2 != 0) {
                r = n1 / n2;
                System.out.println("Divisão: " + r);
            } else {
                System.out.println("Erro: divisão por zero");
            }
        } else {
            System.out.println("Opção inválida");
        }

        sc.close();
    }
}