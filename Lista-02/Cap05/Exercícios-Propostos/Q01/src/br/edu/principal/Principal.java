package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int grupo,valor,A,B,C,D,
		pri,seg,ter,qua;
		
		Scanner sc = new Scanner(System.in);
				
		for (grupo=1;grupo<=5;grupo++) {
			for (valor=1;valor<=4;valor++) {
				System.out.println("Digite o valor de A: ");
				A = sc.nextInt();
				System.out.println("Digite o valor de B: ");
				B = sc.nextInt();
				System.out.println("Digite o valor de C: ");
				C = sc.nextInt();
				System.out.println("Digite o valor de D: ");
				D = sc.nextInt();
				System.out.println("Grupo " + grupo + ": " + A + ", " + B + ", " + C + ", " + D + "\n");
				
				if (A <= B && A <= C && A <= D) {
					pri = A;
					if (B <= C && B <= D) {
						seg = B;
						if (C <= D) {
							ter = C;
							qua = D;
						} else {
							ter = D;
							qua = C;
						}
					} else if (C <= B && C <= D) {
						seg = C;
						if (B <= D) {
							ter = B;
							qua = D;
						} else {
							ter = D;
							qua = B;
						}
					} else {
						seg = D;
						if (B <= C) {
							ter = B;
							qua = C;
						} else {
							ter = C;
							qua = B;
						}
					}
				} else if (B <= A && B <= C && B <= D) {
					pri = B;
					if (A <= C && A <= D) {
						seg = A;
						if (C <= D) {
							ter = C;
							qua = D;
						} else {
							ter = D;
							qua = C;
						}
					} else if (C <= A && C <= D) {
						seg = C;
						if (A <= D) {
							ter = A;
							qua = D;
						} else {
							ter = D;
							qua = A;
						}
					} else {
						seg = D;
						if (A <= C) {
							ter = A;
							qua = C;
						} else {
							ter = C;
							qua = A;
						}
					}
				} else if (C <= A && C <= B && C <= D) {
					pri = C;
					if (A <= B && A <= D) {
						seg = A;
						if (B <= D) {
							ter = B;
							qua = D;
						} else {
							ter = D;
							qua = B;
						}
					} else if (B <= A && B <= D) {
						seg = B;
						if (A <= D) {
							ter = A;
							qua = D;
						} else {
							ter = D;
							qua = A;
						}
					} else {
						seg = D;
						if (A <= B) {
							ter = A;
							qua = B;
						} else {
							ter = B;
							qua = A;
						}
					}
				} else {
					pri = D;
					if (A <= B && A <= C) {
						seg = A;
						if (B <= C) {
							ter = B;
							qua = C;
						} else {
							ter = C;
							qua = B;
						}
					} else if (B <= A && B <= C) {
						seg = B;
						if (A <= C) {
							ter = A;
							qua = C;
						} else {
							ter = C;
							qua = A;
						}
					} else {
						seg = C;
						if (A <= B) {
							ter = A;
							qua = B;
						} else {
							ter = B;
							qua = A;
						}
					}
				}
				System.out.println("Grupo " + grupo + ": " + A + ", " + B + ", " + C + ", " + D);
				System.out.println("Ordem crescente: " + pri + ", " + seg + ", " + ter + ", " + qua);
				System.out.println("Ordem decrescente: " + qua + ", " + ter + ", " + seg + ", " + pri);
				System.out.println("----------------------------------");
			}
		}
	}
}