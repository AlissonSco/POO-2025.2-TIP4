package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,soma,op;
		double raiz;
		System.out.println("          MENU          ");
		System.out.println("1 - Somar dois números");
		System.out.println("2 - Raiz quadrada de um número");

		System.out.println("Digite uma opção:");
		op = sc.nextInt();
		if (op == 1) {
            System.out.println("Digite um valor para o primeiro número:");
            n1 = sc.nextInt();
            
            System.out.println("Digite um valor para o segundo número:");
            n2 = sc.nextInt();
            
            soma = n1 + n2;
            System.out.println("A soma de " + n1 + " e " + n2 + " é " + soma);
            
        } else if (op == 2) {
            System.out.println("Digite um valor:");
            n1 = sc.nextInt();
            
            raiz = Math.sqrt(n1);
            System.out.println("A raiz quadrada de " + n1 + " é " + raiz);
        } else {
            System.out.println("Opção inválida!");
        }
	}
}
