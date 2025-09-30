package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora_i, min_i, hora_f, min_f, minutos;

        System.out.print("Digite a hora inicial do jogo: ");
        hora_i = scanner.nextInt();
        System.out.print("Digite o minuto inicial do jogo: ");
        min_i = scanner.nextInt();

        System.out.print("Digite a hora final do jogo: ");
        hora_f = scanner.nextInt();
        System.out.print("Digite o minuto final do jogo: ");
        min_f = scanner.nextInt();

        minutos = calculo.calculo(hora_i, min_i, hora_f, min_f);

        System.out.println("A duração do jogo foi de " + minutos + " minutos.");

        scanner.close();
    }
}