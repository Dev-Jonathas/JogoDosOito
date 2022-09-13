package com.jogodosoito.functions;

import java.util.Random;

public class Embaralhador {
    
    public static String[][] embaralhar(String[][] tabelaObjetivo) {

        Random random = new Random();
        int length = tabelaObjetivo.length + 1;

        for (int j = 0; j < (tabelaObjetivo.length - 1); j++) {
            for (int i = 0; i < tabelaObjetivo.length; i++) {

                //sorteia um índice
                int l = random.nextInt(tabelaObjetivo.length);
                int k = random.nextInt(tabelaObjetivo.length);

                //troca o conteúdo dos índices i e j do vetor
                String temp = tabelaObjetivo[i][j];
                tabelaObjetivo[i][j] = tabelaObjetivo[k][l];
                tabelaObjetivo[k][l] = temp;
            }
        }

        return tabelaObjetivo;

    }

}


