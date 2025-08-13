package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Arrays;

public class FiltroSemStream {
    public static void main(String[] args) {
        ArrayList<String> herois = new ArrayList<>(Arrays.asList("Homem Aranha", "Wolverine", "Hulk", "Capitão America", "Homem elástico", "Mulher Maravilha", "Pantera Negra", "Viúva Nwgra", "Homem de Ferro", "Miss Marvel", "Mulher Invisível", "Cíclope"));

        ArrayList<String> heroisComH = new ArrayList<>();
        for (String heroi : herois) {
            if (heroi.startsWith("H")) {
                heroisComH.add(heroi);
            }
        }
        System.out.println("Heróis que começam com a letra H\n" + heroisComH);
    }
}
