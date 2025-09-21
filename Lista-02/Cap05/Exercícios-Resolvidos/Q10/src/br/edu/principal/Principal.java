package br.edu.principal;

import java.util.Calendar;

public class Principal {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        int dia = agora.get(Calendar.DAY_OF_MONTH);
        int mes = agora.get(Calendar.MONTH) + 1;
        int ano = agora.get(Calendar.YEAR);
        int hora = agora.get(Calendar.HOUR_OF_DAY);
        int min = agora.get(Calendar.MINUTE);

        System.out.println("Data (DD/MM/AAAA): " + dia + "/" + mes + "/" + ano);

        String nomeMes = "";
        switch (mes) {
            case 1: nomeMes = "janeiro"; break;
            case 2: nomeMes = "fevereiro"; break;
            case 3: nomeMes = "março"; break;
            case 4: nomeMes = "abril"; break;
            case 5: nomeMes = "maio"; break;
            case 6: nomeMes = "junho"; break;
            case 7: nomeMes = "julho"; break;
            case 8: nomeMes = "agosto"; break;
            case 9: nomeMes = "setembro"; break;
            case 10: nomeMes = "outubro"; break;
            case 11: nomeMes = "novembro"; break;
            case 12: nomeMes = "dezembro"; break;
        }

        System.out.println("Data (mês por extenso): " + dia + " de " + nomeMes + " de " + ano);

        System.out.println("Hora:minuto: " + hora + ":" + (min < 10 ? "0" + min : min));
    }
}