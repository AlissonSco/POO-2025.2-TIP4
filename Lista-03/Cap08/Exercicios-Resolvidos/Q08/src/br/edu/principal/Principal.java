package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static int calculo(int h_i, int m_i, int h_f, int m_f) {
        int tot_h, tot_m;

        if (m_f < m_i) {
            m_f = m_f + 60;
            h_f = h_f - 1;
        }

        if (h_f < h_i) {
            h_f = h_f + 24;
        }

        tot_m = m_f - m_i;
        tot_h = h_f - h_i;
        
        int total = tot_h * 60 + tot_m;
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora_i, min_i, hora_f, min_f, minutos;

        System.out.print("Digite a hora inicial do jogo: ");
        hora_i = scanner.nextInt();
        System.out.print("Digite o minuto inicial do jogo: ");
        min_i = scanner.nextInt();

        System.out.print("Digite a hora final do jogo: ");
        hora_f = scanner.nextInt();
        System.out.print("Digite o minuto final do jogo: ");
        min_f = scanner.nextInt();

        minutos = calculo(hora_i, min_i, hora_f, min_f);

        System.out.println("A duração do jogo foi de " + minutos + " minutos.");

        scanner.close();
    }
}