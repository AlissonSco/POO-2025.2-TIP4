package br.edu.principal;

import java.util.Scanner;

public class calculo {

    public static double calculo_reajuste(double pa, double pn) {
        double result = ((pn - pa) / pa) * 100.0;
        return result;
    }
}