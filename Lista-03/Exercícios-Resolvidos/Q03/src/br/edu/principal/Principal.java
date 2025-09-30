package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int a, b, c, result;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite o valor de 'a' (maior que 1): ");
            a = scanner.nextInt();
        } while (a <= 1);

        System.out.print("Digite o valor de 'b': ");
        b = scanner.nextInt();

        System.out.print("Digite o valor de 'c': ");
        c = scanner.nextInt();

        result = calculo.divisores(a, b, c);

        System.out.println("Soma dos inteiros = " + result);

        scanner.close();
    }
}