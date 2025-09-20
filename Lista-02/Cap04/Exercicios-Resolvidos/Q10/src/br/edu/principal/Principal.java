package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira data:");
        System.out.print("Dia: ");
        int d1 = sc.nextInt();
        System.out.print("Mês: ");
        int m1 = sc.nextInt();
        System.out.print("Ano: ");
        int a1 = sc.nextInt();

        System.out.println("Digite a segunda data:");
        System.out.print("Dia: ");
        int d2 = sc.nextInt();
        System.out.print("Mês: ");
        int m2 = sc.nextInt();
        System.out.print("Ano: ");
        int a2 = sc.nextInt();

        if (a1 > a2 || (a1 == a2 && m1 > m2) || (a1 == a2 && m1 == m2 && d1 > d2)) {
            System.out.printf("A maior data é: %02d/%02d/%04d\n", d1, m1, a1);
        } else {
            System.out.printf("A maior data é: %02d/%02d/%04d\n", d2, m2, a2);
        }

        sc.close();
    }
}
