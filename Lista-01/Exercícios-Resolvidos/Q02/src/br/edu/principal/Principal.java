package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.print("Primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Segunda nota: ");
		nota2 = sc.nextDouble();
		
		System.out.print("Terceira nota: ");
		nota3 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		System.out.println(media);
	}
}