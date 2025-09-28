package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static double sequencia(int n) {
        double seq = 1.0;

        for (int a = 1; a <= n; a++) {
            double f = 1.0;
            for (int b = 1; b <= a; b++) {
                f = f * b;
            }
            seq = seq + (1.0 / f);
        }
        
        return seq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        double s;

        System.out.print("Digite um valor inteiro e positivo para N: ");
        num = scanner.nextInt();

        s = sequencia(num);

        System.out.println("O valor da série S é: " + s);

        scanner.close();
    }
}