package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> pokemons = new HashMap<>();

        do {
            try {
                String nome, tipo;
                do {
                    nome = JOptionPane.showInputDialog("Digite o nome de um pokémon ou digite \"FIM\" para encerrar").toUpperCase();

                    if (!nome.equals("FIM")) {
                        if (pokemons.containsKey(nome)) {
                            JOptionPane.showMessageDialog(null, "Este pokémon já foi cadastrado!");
                        } else {
                            tipo = JOptionPane.showInputDialog("Digite o tipo do pokémon informado anteriormente").toUpperCase();
                            pokemons.put(nome, tipo);
                        }
                    }

                } while (!nome.equals("FIM"));

                String escolha = JOptionPane.showInputDialog("Digite um TIPO a sua escolha").toUpperCase();
                ArrayList<String> nomesEncontrados = new ArrayList<>();
                for (Map.Entry<String, String> pokemon : pokemons.entrySet()) {
                    if (pokemon.getValue().equals(escolha)) {
                        nomesEncontrados.add(pokemon.getKey());
                    }
                }
                JOptionPane.showMessageDialog(null, String.format("Para o tipo: %s foram encontrado(s) o(s) pokémon(s)\n%s", escolha, nomesEncontrados));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
