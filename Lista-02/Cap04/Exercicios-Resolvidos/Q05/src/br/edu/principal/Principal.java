package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2, num3, num4;

        System.out.println("Digite três números em ordem crescente:");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        System.out.println("Digite um número (fora de ordem):");
        num4 = sc.nextDouble();

        if (num4 > num3) {
            System.out.println("A ordem decrescente é: " + num4 + " - " + num3 + " - " + num2 + " - " + num1);
        } 
        else if (num4 > num2 && num4 < num3) {
            System.out.println("A ordem decrescente é: " + num3 + " - " + num4 + " - " + num2 + " - " + num1);
        } 
        else if (num4 > num1 && num4 < num2) {
            System.out.println("A ordem decrescente é: " + num3 + " - " + num2 + " - " + num4 + " - " + num1);
        } 
        else if (num4 < num1) {
            System.out.println("A ordem decrescente é: " + num3 + " - " + num2 + " - " + num1 + " - " + num4);
        }

        sc.close();
    }
}