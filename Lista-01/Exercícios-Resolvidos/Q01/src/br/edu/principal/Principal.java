package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4, soma;
		
		System.out.printf("Primeiro número: ");
		n1 = sc.nextDouble();
		
		System.out.printf("Segundo número: ");
		n2 = sc.nextDouble();
		
		System.out.printf("Terceiro número: ");
		n3 = sc.nextDouble();
		
		System.out.printf("Quarto número: ");
		n4 = sc.nextDouble();
		
		soma = n1 + n2 + n3 + n4;
		
		System.out.println(soma);
	}
}