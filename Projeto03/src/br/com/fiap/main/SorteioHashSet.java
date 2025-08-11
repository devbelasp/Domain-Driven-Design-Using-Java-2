package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class SorteioHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numerosSorteados = new HashSet<Integer>();
        Random random = new Random();
        do {
            while (numerosSorteados.size() < 6) {
                int numero = random.nextInt(1, 61);
                numerosSorteados.add(numero);
            }
            ArrayList<Integer> resultadoDoSorteio = new ArrayList<Integer>(numerosSorteados);
            Collections.sort(resultadoDoSorteio);
            JOptionPane.showMessageDialog(null, "Números Sorteados da Loteria do Tigrinho\n" + resultadoDoSorteio, "Mega Tigre", JOptionPane.WARNING_MESSAGE);
            numerosSorteados.clear();
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
