package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double sal, perc, aumento, novosal;
		
		System.out.print("Salário: ");
		sal = sc.nextDouble();
		
		System.out.print("Percentual do aumento: ");
		perc = sc.nextDouble();
		
		aumento = sal * perc/100;
		
		System.out.println(aumento);
		
		novosal = sal + aumento;
		
		System.out.println(novosal);

	}	
}