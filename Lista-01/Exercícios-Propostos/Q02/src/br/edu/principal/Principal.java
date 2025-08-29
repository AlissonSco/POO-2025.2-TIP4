package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, multiplicacao;
		
		System.out.print("Primeiro número: ");
		n1 = sc.nextDouble();
		
		System.out.print("Segundo número: ");
		n2 = sc.nextDouble();
		
		System.out.print("Terceiro número: ");
		n3 = sc.nextDouble();
		
		multiplicacao = n1 * n2 * n3;
		
		System.out.println(multiplicacao);
	}

}