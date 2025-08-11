package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<String, String>();
        do {
            try {
                String nomePokemon, tipoPokemon;
                do {
                    nomePokemon = JOptionPane.showInputDialog("Digite o nome do Pokemon ou digite \"FIM\" para encerrar.").toUpperCase();

                    if (!nomePokemon.equals("FIM")) {
                        if (mapa.containsKey(nomePokemon)) {
                            JOptionPane.showMessageDialog(null, "Este Pokemon já foi cadastrado!");
                        } else {
                            tipoPokemon = JOptionPane.showInputDialog("Digite o tipo do Pokemon informado anteriormente.");
                            mapa.put(nomePokemon, tipoPokemon);
                        }
                    }
                } while (!nomePokemon.equals("FIM"));

                String escolha = JOptionPane.showInputDialog("Digite o tipo do Pokemon de sua escolha.").toUpperCase();
                if (mapa.containsKey(escolha)) {
                    JOptionPane.showMessageDialog(null, "Os Pokemons cadastrados deste tipo são:" + mapa.get(escolha), "Pokemons", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Pokemon não cadastrado!", "Atenção", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}

