package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int resultado = verificarDivisivel(num1, num2);
        System.out.println("Resultado: " + resultado);
    }

    public static int verificarDivisivel(int num1, int num2) {
        if (num1 % num2 == 0) {
            return 0;
        } else {
            int proximoDivisor = num1 + 1;
            while (proximoDivisor % num2 != 0) {
                proximoDivisor++;
            }
            return proximoDivisor;
        }
    }
}