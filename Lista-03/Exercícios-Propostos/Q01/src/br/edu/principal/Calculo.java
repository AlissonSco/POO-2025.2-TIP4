package br.edu.principal;

public class Calculo {
	
    public static int somaNumerosEntre1eN(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
	
}
