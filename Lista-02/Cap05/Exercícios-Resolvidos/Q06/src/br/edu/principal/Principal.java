package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("\n--- Funcionário " + i + " ---");

            System.out.print("Digite o código do funcionário: ");
            int codigo = sc.nextInt();

            System.out.print("Número de horas trabalhadas: ");
            int horas = sc.nextInt();

            char turno = ' ';
            while (turno != 'M' && turno != 'V' && turno != 'N') {
                System.out.print("Turno (M - matutino, V - vespertino, N - noturno): ");
                String t = sc.next().trim().toUpperCase();
                if (!t.isEmpty()) {
                    turno = t.charAt(0);
                }
                if (turno != 'M' && turno != 'V' && turno != 'N') {
                    System.out.println("Turno inválido. Informe M, V ou N.");
                }
            }

            char categoria = ' ';
            while (categoria != 'O' && categoria != 'G') {
                System.out.print("Categoria (O - operário, G - gerente): ");
                String c = sc.next().trim().toUpperCase();
                if (!c.isEmpty()) {
                    categoria = c.charAt(0);
                }
                if (categoria != 'O' && categoria != 'G') {
                    System.out.println("Categoria inválida. Informe O ou G.");
                }
            }

            double valorHora;
            if (categoria == 'O') {
                valorHora = (turno == 'N') ? 18.0 : 15.0;
            } else {
                valorHora = (turno == 'N') ? 35.0 : 30.0;
            }

            double salarioInicial = horas * valorHora;
            double auxAlimentacao;
            if (salarioInicial <= 450.0) {
                auxAlimentacao = salarioInicial * 0.20;
            } else if (salarioInicial <= 700.0) {
                auxAlimentacao = salarioInicial * 0.15;
            } else {
                auxAlimentacao = salarioInicial * 0.10;
            }

            double salarioFinal = salarioInicial + auxAlimentacao;

            System.out.println("Código: " + codigo);
            System.out.println("Horas trabalhadas: " + horas);
            System.out.println("Valor da hora: R$ " + valorHora);
            System.out.println("Salário inicial: R$ " + salarioInicial);
            System.out.println("Auxílio alimentação: R$ " + auxAlimentacao);
            System.out.println("Salário final: R$ " + salarioFinal);
        }

        sc.close();
    }
}

