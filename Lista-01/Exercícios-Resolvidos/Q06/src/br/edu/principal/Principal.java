package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        
        double sal,grat,imp;
        
        System.out.print("Digite seu salário: ");
        sal = sc.nextDouble();

        grat = sal * 0.05;
        imp = sal * 0.07;

        double salReceber = sal + grat - imp;

        System.out.println("Salário a receber: " + salReceber);

    }
}