package br.edu.principal;

import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		double sal, sal_novo, percentual;
		Calendar c = Calendar.getInstance();
		int ano_atual = c.get(Calendar.YEAR);
		
		sal = 1000;
		percentual = 1.5/100;
		sal_novo = sal + (percentual*sal);
		
		for (int i = 2007; i <= ano_atual; i++) {
			percentual *= 2;
			sal_novo += (percentual*sal_novo);
		}
		System.out.println("Novo salário: " + sal_novo);
	}

}