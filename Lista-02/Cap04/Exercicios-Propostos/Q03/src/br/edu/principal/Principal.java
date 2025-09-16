package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 , n2;
		
		System.out.println("Digite um número(n1):");
		n1 = sc.nextInt();
		
		System.out.println("Digite outro número(n2):");
		n2 = sc.nextInt();	    
		
		if (n1>n2) {
			System.out.println("n2 (" + n2 + ") é menor do que n1 (" + n1 + ")");
		} else {
			System.out.println("n1 (" + n1 + ") é menor do que n2 (" + n2 + ")");
		}
	}

}
