package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static int somar(int num1, int num2) {
        int soma = 0;
        int menor;
        int maior;

        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

        for (int i = menor + 1; i < maior; i++) {
            soma = soma + i;
        }

        return soma;
    }

    public static void main(String[] args) {
        int num1, num2, s;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();

        s = somar(num1, num2);

        System.out.println("soma = " + s);

    }
}