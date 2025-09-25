package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n, num, i, j;
		long fat;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de valores a serem lidos: ");
		n = sc.nextInt();
		
		for (i = 1; i <= n; i++) {
			System.out.print("Digite o valor #" + i + ": ");
			num = sc.nextInt();
			
			fat = 1;
			for (j = 1; j <= num; j++) {
				fat *= j;
			}
			
			System.out.println("Valor: " + num + " - Fatorial: " + fat);
		}
		
	}
}
