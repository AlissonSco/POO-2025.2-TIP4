package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double base,altura,area;
		
		System.out.println("Digite a base do triângulo: ");
		base = sc.nextDouble();
		
		System.out.println("Digite a altura do triângulo: ");
		altura = sc.nextDouble();
		
		area = (base*altura)/2;
		
		System.out.println("A área do triângulo é igual a: " + area);
		
	}

}
