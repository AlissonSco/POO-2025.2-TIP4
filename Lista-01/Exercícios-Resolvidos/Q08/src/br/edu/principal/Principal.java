package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		double dep,taxa,rend,total;
		
		System.out.println("Digite o depósito: ");
		dep = sc.nextDouble();
		
		System.out.println("Digite a taxa: ");
		taxa = sc.nextDouble();
		
		rend = dep * taxa/100;
		
		total = dep + rend;
		
		System.out.println("Rendimento: " + rend);
		System.out.println("Total: " + total);
	}
}
