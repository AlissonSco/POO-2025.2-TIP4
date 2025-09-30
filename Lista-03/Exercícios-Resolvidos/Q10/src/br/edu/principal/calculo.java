package br.edu.principal;

public class calculo {

    public static double sequencia(int n) {
        double seq = 1.0;

        for (int a = 1; a <= n; a++) {
            double f = 1.0;
            for (int b = 1; b <= a; b++) {
                f = f * b;
            }
            seq = seq + (1.0 / f);
        }
        
        return seq;
    }
}