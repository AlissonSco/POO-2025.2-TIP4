package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double e;
		long fat;
		int n,i,j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de n: ");
		n = sc.nextInt();
		e = 1;
		
		for (i = 1; i <= n; i++) {
			fat = 1;
			for (j = 1; j<=i; j++) {
				fat *= j;
			}
				e += 1.0/fat;
		}
		System.out.println(e);
	}

}