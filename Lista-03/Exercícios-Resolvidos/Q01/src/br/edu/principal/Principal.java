package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int num, aux;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = scanner.nextInt();

        aux = calculo.verifica(num);

        if (aux == 1) {
            System.out.println("O número é positivo");
        } else {
            System.out.println(" O Número negativo");
        }

    }
}