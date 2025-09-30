package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static int verifica(int num) {
        int res;
        if (num >= 0) {
            res = 1;
        } else {
            res = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o total de segundos para conversão: ");
        int totalSegundos = sc.nextInt();

        calculo.transformacao(totalSegundos);

        sc.close();
    }
}
