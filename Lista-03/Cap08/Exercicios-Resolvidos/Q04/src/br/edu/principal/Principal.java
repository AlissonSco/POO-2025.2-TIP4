package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void transformacao(int totalSegundos) {
        int h, m, s, r;

        h = totalSegundos / 3600;
        r = totalSegundos % 3600;
        m = r / 60;
        s = r % 60;

        System.out.println(h + " horas, " + m + " minutos e " + s + " segundos.");
    }

    public static void main(String[] args) {
        int seg;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em segundos: ");
        seg = scanner.nextInt();

        transformacao(seg);

    }
}