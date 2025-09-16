package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.print("Digite o primeiro número (n1): ");
        n1 = sc.nextInt();
        
        System.out.print("Digite o segundo número (n2): ");
        n2 = sc.nextInt();
        
        System.out.print("Digite o terceiro número (n3): ");
        n3 = sc.nextInt();
        
        if (n1 >= n2 && n1 >= n3) {
            System.out.print("O maior número é: " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.print("O maior número é: " + n2);
        } else {
            System.out.print("O maior número é: " + n3);
        }
    }
}
