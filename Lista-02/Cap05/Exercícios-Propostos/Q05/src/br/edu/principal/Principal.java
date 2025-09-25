package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		for (int i=0;i<=10; i++) {
			System.out.println("Tabuada de " + i + ":");
			for (int j=0;j<=10;j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}

	}

}