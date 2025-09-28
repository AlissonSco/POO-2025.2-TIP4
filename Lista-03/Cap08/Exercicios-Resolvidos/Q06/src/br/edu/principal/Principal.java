package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void multiplicacao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Digite um número inteiro no intervalo de 1 a 9: ");
            num = scanner.nextInt();
        } while (num < 1 || num > 9);

        multiplicacao(num);

        scanner.close();
    }
}