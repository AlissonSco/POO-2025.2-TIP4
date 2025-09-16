package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ,b ,c ,i;
		System.out.println("Digite um valor para A");
		a = sc.nextInt();
		System.out.println("Digite um valor para B");
		b = sc.nextInt();
		System.out.println("Digite um valor para C");
		c = sc.nextInt();
		System.out.println("Digite um valor para I(1 , 2 ou 3)");
		i = sc.nextInt();
		if (i == 1) {
		    if (a < b && a < c) {
		        if (b < c) {
		            System.out.println("A ordem crescente dos números é: " + a + "-" + b + "-" + c);
		        } else {
		            System.out.println("A ordem crescente dos números é: " + a + "-" + c + "-" + b);
		        }
		    }

		    if (b < a && b < c) {
		        if (a < c) {
		            System.out.println("A ordem crescente dos números é: " + b + "-" + a + "-" + c);
		        } else {
		            System.out.println("A ordem crescente dos números é: " + b + "-" + c + "-" + a);
		        }
		    }

		    if (c < a && c < b) {
		        if (a < b) {
		            System.out.println("A ordem crescente dos números é: " + c + "-" + a + "-" + b);
		        } else {
		            System.out.println("A ordem crescente dos números é: " + c + "-" + b + "-" + a);
		        }
		    }
		}
		if (i == 2) {
		    if (a > b && a > c) {
		        if (b > c) {
		            System.out.println("A ordem decrescente dos números é: " + a + "-" + b + "-" + c);
		        } else {
		            System.out.println("A ordem decrescente dos números é: " + a + "-" + c + "-" + b);
		        }
		    }
		    if (b > a && b > c) {
		        if (a > c) {
		            System.out.println("A ordem decrescente dos números é: " + b + "-" + a + "-" + c);
		        } else {
		            System.out.println("A ordem decrescente dos números é: " + b + "-" + c + "-" + a);
		        }
		    }
		    if (c > a && c > b) {
		        if (a > b) {
		            System.out.println("A ordem decrescente dos números é: " + c + "-" + a + "-" + b);
		        } else {
		            System.out.println("A ordem decrescente dos números é: " + c + "-" + b + "-" + a);
		        }
		    }
		}
		if (i == 3) {
		    if ((a > b && a > c)) {
		        if (b < c) {
		            System.out.println("Maior no meio: " + b + "-" + a + "-" + c);
		        } else {
		            System.out.println("Maior no meio: " + c + "-" + a + "-" + b);
		        }
		    }
		    if ((b > a && b > c)) {
		        if (a < c) {
		            System.out.println("Maior no meio: " + a + "-" + b + "-" + c);
		        } else {
		            System.out.println("Maior no meio: " + c + "-" + b + "-" + a);
		        }
		    }   
		    if ((c > a && c > b)) {
		        if (a < b) {
		            System.out.println("Maior no meio: " + a + "-" + c + "-" + b);
		        } else {
		            System.out.println("Maior no meio: " + b + "-" + c + "-" + a);
		        }
		    }
		}
	}
}