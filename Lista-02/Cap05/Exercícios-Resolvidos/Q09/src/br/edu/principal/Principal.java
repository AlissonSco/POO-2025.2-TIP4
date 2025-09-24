package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aprovados = 0, exame = 0, reprovados = 0;
        double somaMedias = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite a 1ª nota do aluno " + i + ": ");
            double n1 = sc.nextDouble();

            System.out.print("Digite a 2ª nota do aluno " + i + ": ");
            double n2 = sc.nextDouble();

            double media = (n1 + n2) / 2;
            somaMedias += media;

            System.out.print("Aluno " + i + " - Média: " + media + " - ");

            if (media < 3) {
                System.out.println("Reprovado");
                reprovados++;
            } else if (media < 7) {
                System.out.println("Exame");
                exame++;
            } else {
                System.out.println("Aprovado");
                aprovados++;
            }
        }

        double mediaClasse = somaMedias / 6;

        System.out.println("\nResumo da Turma:");
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Exame: " + exame);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Média da classe: " + mediaClasse);

    }
}
