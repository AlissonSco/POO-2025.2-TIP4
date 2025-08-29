package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota1,nota2;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        double media = ((nota1*2) + (nota2*3)) / (2+3);

        System.out.printf("A média ponderada é: " + media);
    }
}