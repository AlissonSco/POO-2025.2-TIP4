package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, subtracao;
		
		System.out.printf("Primeiro número: ");
		n1 = sc.nextDouble();
		
		System.out.printf("Segundo número: ");
		n2 = sc.nextDouble();
		
		subtracao = n1 - n2;
		
		System.out.println(subtracao);
	}
}