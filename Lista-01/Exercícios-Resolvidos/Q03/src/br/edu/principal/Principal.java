package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, peso1, peso2, peso3, media;
		
		System.out.print("Primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Segunda nota: ");
		nota2 = sc.nextDouble();
		
		System.out.print("Terceira nota: ");
		nota3 = sc.nextDouble();
		
		System.out.print("Peso 1: ");
		peso1 = sc.nextDouble();
		
		System.out.print("Peso 2: ");
		peso2 = sc.nextDouble();
		
		System.out.print("Peso 3: ");
		peso3 = sc.nextDouble();
		
		media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3)/(peso1 + peso2 + peso3);
		System.out.println(media);

	}
}