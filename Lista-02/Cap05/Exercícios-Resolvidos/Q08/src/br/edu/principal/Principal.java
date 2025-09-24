package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        int n = sc.nextInt();

        int seq1 = 2;
        int seq2 = 7;
        int seq3 = 3;

        System.out.println("Série gerada:");
        for (int i = 1; i <= n; i++) {

            if (i % 3 == 1) {
                System.out.print(seq1 + " ");
                seq1 *= 2;
            }

            else if (i % 3 == 2) {
                System.out.print(seq2 + " ");
                seq2 *= 3;
            }
            else {
                System.out.print(seq3 + " ");
                seq3 *= 4;
            }
        }

    }
}