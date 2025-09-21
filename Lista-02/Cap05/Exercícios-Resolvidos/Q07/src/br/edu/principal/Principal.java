package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contIdadeMaior50 = 0;
        double somaAlturas = 0;
        int contAlturas = 0;
        int contPesoMenor40 = 0;
        for (int i = 1; i <= 5; i++) {
            int idade = sc.nextInt();
            double altura = sc.nextDouble();
            double peso = sc.nextDouble();

            if (idade > 50) contIdadeMaior50++;
            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                contAlturas++;
            }
            if (peso < 40) contPesoMenor40++;
        }
        double mediaAlturas = contAlturas > 0 ? somaAlturas / contAlturas : 0;
        double porcentagemPesoMenor40 = (contPesoMenor40 / 5.0) * 100;

        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + contIdadeMaior50);
        if (contAlturas > 0) {
            System.out.println("Média das alturas (10 a 20 anos): " + mediaAlturas);
        } else {
            System.out.println("Média das alturas (10 a 20 anos): 0");
        }
        System.out.println("Porcentagem de pessoas com peso < 40 kg: " + porcentagemPesoMenor40 + "%");
    }
}
