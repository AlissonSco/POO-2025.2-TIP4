package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        double s;

        System.out.print("Digite um valor inteiro e positivo para N: ");
        num = scanner.nextInt();

        s = calculo.sequencia(num);

        System.out.println("O valor da série S é: " + s);

        scanner.close();
    }
}