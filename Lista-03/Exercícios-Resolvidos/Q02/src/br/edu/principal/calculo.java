package br.edu.principal;

public class calculo {

    public static int somar(int num1, int num2) {
        int soma = 0;
        int menor;
        int maior;

        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

        for (int i = menor + 1; i < maior; i++) {
            soma = soma + i;
        }

        return soma;
    }
}