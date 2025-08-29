package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double  n1,n2;
		
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextDouble();
		
		double resultado = n1 / n2;
		
		System.out.println("Resultado da divisão: " + resultado);
	}
}