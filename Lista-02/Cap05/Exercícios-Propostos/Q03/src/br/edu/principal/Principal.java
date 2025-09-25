package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade;
		double porc_e1, porc_e5,
		e1=0,e2=0,e3=0,e4=0,e5=0;
		Scanner sc = new Scanner(System.in);
		
		for (int i=1; i<=8;i ++) {
			System.out.println("Digite a idade da " + i + "ª pessoa: ");
			idade = sc.nextInt();
			
			if (idade <= 15) {
				e1++;
			}
			else if (idade >= 16 & idade <= 30) {
				e2++;
			}
			else if (idade >= 31 & idade <= 45) {
				e3++;
			}
			else if (idade >= 46 & idade <= 60) {
				e4++;
			}
			else if (idade > 60) {
				e5++;
			}
		}
		System.out.println("1ª Faixa etária: " + e1);
		System.out.println("2ª Faixa etária: " + e2);
		System.out.println("3ª Faixa etária: " + e3);
		System.out.println("4ª Faixa etária: " + e4);
		System.out.println("5ª Faixa etária: " + e5);
		
		System.out.println("Porcentagem de pessoas na 1ª faixa etária: " + (e1/8)*100 + "%");
		System.out.println("Porcentagem de pessoas na 5ª faixa etária: " + (e5/8)*100 + "%");
	}

}