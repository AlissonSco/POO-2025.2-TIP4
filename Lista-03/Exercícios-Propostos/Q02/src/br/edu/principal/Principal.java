package br.edu.principal;

import br.edu.principal.calculo;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as horas: ");
        int horas = sc.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Digite os segundos: ");
        int segundos = sc.nextInt();

        int totalSegundos = calculo.converterParaSegundos(horas, minutos, segundos);
        System.out.println("O total em segundos é: " + totalSegundos);
    }
}