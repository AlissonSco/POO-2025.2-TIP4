package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contIdadePeso = 0;
        double somaIdades = 0;
        double contAlturaBaixa = 0;
        int contOlhosAzuis = 0;
        int contRuivosNaoAzuis = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Pessoa " + i);

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();

            System.out.print("Digite o peso: ");
            double peso = sc.nextDouble();

            System.out.print("Digite a altura: ");
            double altura = sc.nextDouble();

            System.out.print("Digite a cor dos olhos (A — azul; P — preto; V — verde; C — castanho): ");
            String olhos = sc.next().toUpperCase();

            System.out.print("Digite a cor dos cabelos (P — preto; C — castanho; L — louro; R — ruivo): ");
            String cabelos = sc.next().toUpperCase();

            if (idade > 50 && peso < 60) {
                contIdadePeso = contIdadePeso + 1;
            } else {
                contIdadePeso = contIdadePeso + 0;
            }

            if (altura < 1.50) {
                somaIdades = somaIdades + idade;
                contAlturaBaixa = contAlturaBaixa + 1;
            } else {
                somaIdades = somaIdades + 0;
                contAlturaBaixa = contAlturaBaixa + 0;
            }

            if (olhos == "A") {
                contOlhosAzuis = contOlhosAzuis + 1;
            } else {
                contOlhosAzuis = contOlhosAzuis + 0;
            }

            if (cabelos == "R" && olhos != "A") {
                contRuivosNaoAzuis = contRuivosNaoAzuis + 1;
            } else {
                contRuivosNaoAzuis = contRuivosNaoAzuis + 0;
            }

            System.out.println();
        }

        double mediaIdades;
        if (contAlturaBaixa > 0) {
            mediaIdades = somaIdades / contAlturaBaixa;
        } else {
            mediaIdades = 0;
        }

        double porcentagemAzuis;
        if (contOlhosAzuis > 0) {
            porcentagemAzuis = (contOlhosAzuis / 6.0) * 100;
        } else {
            porcentagemAzuis = 0;
        }

        System.out.println("Quantidade de pessoas com idade > 50 e peso < 60: " + contIdadePeso);
        System.out.println("Média das idades (altura < 1,50 m): " + mediaIdades);
        System.out.println("Porcentagem de pessoas com olhos azuis: " + porcentagemAzuis + "%");
        System.out.println("Quantidade de pessoas ruivas sem olhos azuis: " + contRuivosNaoAzuis);

    }
}
