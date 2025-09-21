package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaIdades = 0;
        double contPesoAltura = 0;
        double contIdadeAltura = 0;
        double contAlturaMaior190 = 0;

        for (int i = 1; i <= 10; i++) {
            int idade = sc.nextInt();
            double peso = sc.nextDouble();
            double altura = sc.nextDouble();

            somaIdades += idade;

            if (peso > 90 && altura < 1.50) {
                contPesoAltura++;
            }

            if (altura > 1.90) {
                contAlturaMaior190++;
                if (idade >= 10 && idade <= 30) {
                    contIdadeAltura++;
                }
            }
        }

        double mediaIdades = somaIdades / 10;
        double porcentagemIdadeAltura = contAlturaMaior190 > 0 ? (contIdadeAltura / contAlturaMaior190) * 100 : 0;

        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Quantidade de pessoas com peso > 90kg e altura < 1,50m: " + contPesoAltura);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos (altura > 1,90m): " + porcentagemIdadeAltura + "%");
    }
}
