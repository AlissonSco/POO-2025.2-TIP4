package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int num1, num2, s;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();

        s = calculo.somar(num1, num2);

        System.out.println("soma = " + s);

    }
}