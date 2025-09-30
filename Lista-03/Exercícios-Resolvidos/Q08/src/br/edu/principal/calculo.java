package br.edu.principal;

public class calculo {

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
}