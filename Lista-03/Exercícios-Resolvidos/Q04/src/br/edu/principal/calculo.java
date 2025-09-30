package br.edu.principal;

public class calculo {

    public static void transformacao(int totalSegundos) {
        int h, m, s, r;

        h = totalSegundos / 3600;
        r = totalSegundos % 3600;
        m = r / 60;
        s = r % 60;

        System.out.println("Horas: " + h);
        System.out.println("Minutos: " + m);
        System.out.println("Segundos: " + s);
    }
}
