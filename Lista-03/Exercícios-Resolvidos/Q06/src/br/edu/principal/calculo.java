package br.edu.principal;

public class calculo {

    public static void multiplicacao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}