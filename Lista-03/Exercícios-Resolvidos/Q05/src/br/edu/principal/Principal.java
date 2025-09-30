package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double precoAntigo, precoAtual, acrescimo;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor antigo do produto: R$ ");
        precoAntigo = scanner.nextDouble();

        System.out.print("Digite o valor atual do produto: R$ ");
        precoAtual = scanner.nextDouble();

        acrescimo = calculo.calculo_reajuste(precoAntigo, precoAtual);

        System.out.println("O percentual de acréscimo foi: " + acrescimo + "%");

    }
}