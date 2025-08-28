package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		double sal,salreceber,imposto;
		
		System.out.print("Digite seu salário: ");
        sal = sc.nextDouble();
        
        imposto = sal * 10/100;
        
        salreceber = sal + 50 - imposto;
        
        System.out.println("Salário a receber: " + salreceber);
        
	}
}