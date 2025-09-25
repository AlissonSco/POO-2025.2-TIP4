package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int cont, cod, num_vei, num_acid;
        int maior, cid_maior, menor, cid_menor;
        int soma_vei, soma_acid, cont_acid;

        Scanner sc = new Scanner(System.in);

        cid_menor = 0;
        cid_maior = 0;
        maior = 0;
        menor = 0;
        soma_vei = 0;
        soma_acid = 0;
        cont_acid = 0;

        for (cont = 1; cont <= 5; cont++) {
            System.out.print("Digite o código da cidade: ");
            cod = sc.nextInt();
            System.out.print("Digite o número de veículos de passeio: ");
            num_vei = sc.nextInt();
            System.out.print("Digite o número de acidentes com vítimas: ");
            num_acid = sc.nextInt();

            if (cont == 1) {
                maior = num_acid;
                cid_maior = cod;
                menor = num_acid;
                cid_menor = cod;
            } else {
                if (num_acid > maior) {
                    maior = num_acid;
                    cid_maior = cod;
                }
                if (num_acid < menor) {
                    menor = num_acid;
                    cid_menor = cod;
                }
            }

            soma_vei += num_vei;

            if (num_vei < 2000) {
                soma_acid += num_acid;
                cont_acid++;
            }
        }

        double media_vei = soma_vei / 5.0;
        System.out.println("\n== RESULTADOS ==");
        System.out.println("Maior índice de acidentes: " + maior + " - Cidade: " + cid_maior);
        System.out.println("Menor índice de acidentes: " + menor + " - Cidade: " + cid_menor);
        System.out.printf("Média de veículos nas cinco cidades: %.2f\n", media_vei);

        if (cont_acid == 0) {
            System.out.println("Nenhuma cidade com menos de 2000 veículos.");
        } else {
            double media_acid = soma_acid / (double) cont_acid;
            System.out.printf("Média de acidentes nas cidades com menos de 2000 veículos: %.2f\n", media_acid);
        }

    }
}
