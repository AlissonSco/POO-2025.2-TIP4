package br.edu.principal;

import java.util.Scanner;

public class calculo {

    public static void maior_menor() {
        Scanner scanner = new Scanner(System.in);
        int num, maior = 0, menor = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = scanner.nextInt();

            if (i == 1) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }

    public static void main(String[] args) {
        maior_menor();
    }
}
