package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo N: ");
        int n = sc.nextInt();

        int soma = Calculo.somaNumerosEntre1eN(n);
        System.out.println("A soma dos números entre 1 e " + n + " é: " + soma);
    }

}