package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Digite um número inteiro no intervalo de 1 a 9: ");
            num = scanner.nextInt();
        } while (num < 1 || num > 9);

        calculo.multiplicacao(num);

        scanner.close();
    }
}