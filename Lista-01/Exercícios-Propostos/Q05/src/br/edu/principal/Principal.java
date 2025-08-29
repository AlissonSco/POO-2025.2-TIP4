package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double precoProduto, novoPreco, desconto;
		
		System.out.print("Preço do produto: ");
		precoProduto = sc.nextDouble();
		
		desconto = 0.1;
		
		novoPreco = precoProduto - (precoProduto * desconto);
		
		System.out.println(novoPreco);
	}
}