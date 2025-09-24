package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalJogadores = 5 * 11;
        int menores18 = 0;
        double somaAlturas = 0;
        int acima80kg = 0;

        for (int t = 1; t <= 5; t++) {
            int somaIdadesTime = 0;

            System.out.println("\n--- Time " + t + " ---");
            for (int j = 1; j <= 11; j++) {
                System.out.println("Jogador " + j + ":");

                System.out.print("Idade: ");
                int idade = sc.nextInt();

                System.out.print("Peso (kg): ");
                double peso = sc.nextDouble();

                System.out.print("Altura (m): ");
                double altura = sc.nextDouble();

                if (idade < 18) {
                    menores18++;
                }

                if (peso > 80) {
                    acima80kg++;
                }

                somaIdadesTime += idade;
                somaAlturas += altura;
            }

            double mediaIdadeTime = (double) somaIdadesTime / 11;
            System.out.println("Média das idades do time " + t + ": " + mediaIdadeTime);
        }

        double mediaAlturaCampeonato = somaAlturas / totalJogadores;
        double porcentagemAcima80 = (acima80kg * 100.0) / totalJogadores;

        System.out.println("\n--- Estatísticas Finais ---");
        System.out.println("Quantidade de jogadores com menos de 18 anos: " + menores18);
        System.out.println("Média das alturas do campeonato: " + mediaAlturaCampeonato);
        System.out.println("Porcentagem de jogadores com mais de 80kg: " + porcentagemAcima80 + "%");

    }
}
