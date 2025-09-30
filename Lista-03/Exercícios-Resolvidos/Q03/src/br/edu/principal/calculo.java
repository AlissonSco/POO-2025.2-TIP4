package br.edu.principal;

import java.util.Scanner;

public class calculo {

    public static int divisores(int a, int b, int c) {
        int soma = 0;
        int menor, maior;

        if (b < c) {
            menor = b;
            maior = c;
        } else {
            menor = c;
            maior = b;
        }

        for (int i = menor; i <= maior; i++) {
            if (i % a == 0) {
                soma = soma + i;
            }
        }
        return soma;
    }
}