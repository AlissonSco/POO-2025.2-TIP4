package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = sc.nextDouble();
		
		for (int i = 0; i<=10; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
	}

}