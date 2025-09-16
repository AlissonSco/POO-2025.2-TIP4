package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1 , n2 , media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		n2 = sc.nextDouble();
	
		media = (n1+n2)/2;
		
		if (media >= 0 && media < 3) {
			System.out.println("Aluno reprovado com média: " + media);
		} else if (media >= 3 && media < 7) {
			System.out.println("Aluno irá fazer o exame - média atual: " + media);
		} else {
			System.out.println("Aluno Aprovado com média: " + media);
		}
		
	}
}
