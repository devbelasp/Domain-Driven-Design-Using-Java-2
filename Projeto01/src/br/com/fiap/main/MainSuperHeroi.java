package br.com.fiap.main;

import br.com.fiap.bean.Equipe;
import br.com.fiap.bean.SuperHeroi;
import com.sun.nio.sctp.AbstractNotificationHandler;

import javax.swing.*;

public class MainSuperHeroi {
    public static void main(String[] args) {
        SuperHeroi heroi;
        String nome;
        String idSecreta;
        String[] poderes;
        String[] fraquezas;
        int qtdPoderes;
        int qtdFraquezas;

        do {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome do super-herói");
                idSecreta = JOptionPane.showInputDialog("Qual é sua id Secreta?");
                qtdPoderes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de poderes?"));
                qtdFraquezas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de fraquezas?"));

                poderes = new String[qtdPoderes];
                for (int i = 0; i < qtdPoderes; i++) {
                    poderes[i] = JOptionPane.showInputDialog(String.format("Poder %d:", i + 1));
                }
                fraquezas = new String[qtdFraquezas];
                for (int i = 0; i < qtdFraquezas ; i++) {
                    fraquezas[i] = JOptionPane.showInputDialog(String.format("Fraqueza %d:", i + 1));
                }

                heroi = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
                heroi.listarHeroi();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
