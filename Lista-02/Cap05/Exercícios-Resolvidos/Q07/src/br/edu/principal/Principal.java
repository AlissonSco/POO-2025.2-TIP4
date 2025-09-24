package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        int a = 0, b = 1, c;

        System.out.print(a + " - " + b);

        for (int i = 2; i < 8; i++) {
            c = a + b;
            System.out.print(" - " + c);
            a = b;
            b = c;
        }
    }
}
