package br.edu.principal;

public class Principal {

	public static void main(String[] args) {	
		double prec_ing, vend_ing, lucro_max;
		
		vend_ing = 120;
		
		for (prec_ing = 5; prec_ing >= 1; prec_ing -= 0.5) {
			lucro_max = (prec_ing*vend_ing)-200;
			System.out.println("Preço do ingresso: R$" + prec_ing);
			System.out.println("Lucro máximo: " + lucro_max);
			System.out.println("Qtd de ingressos vendidos: " + vend_ing + "\n");
			vend_ing += 26;
		}

	}

}