package br.edu.principal;

import java.util.Scanner;

public class calculo {

    public static double calcula_media(double n1, double n2, double n3, char letra) {
        double media = 0;
        
        if (letra == 'A') {
            media = (n1 + n2 + n3) / 3.0;
        } else if (letra == 'P') {
            media = (n1 * 5 + n2 * 3 + n3 * 2) / (5 + 3 + 2);
        }
        
        return media;
    }
}