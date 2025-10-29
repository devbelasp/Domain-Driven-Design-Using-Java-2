//Andrei de Paiva Gibbini - RM: 563061
//Felipe Monte de Sousa - RM: 562019
//Isabela dos Santos Pinto - RM: 563422
//Manuela de Lacerda Soares - RM: 564887

package br.com.fiap.main;

import br.com.fiap.bean.DragonBallSuper;

import javax.swing.*;
import java.io.IOException;

public class UsaDBSuper {
    public static void main(String[] args) {
        String nome, path, opcaoStr;
        int opcao, ki, tecnicas, velocidade, transformacoes;
        DragonBallSuper personagem;
        do {
            try {
                // Menu principal
                opcaoStr = JOptionPane.showInputDialog("Escolha\n(1) Cadastrar personagem de Dragon Ball Super\n(2) Consultar personagem de Dragon Ball Super");
                if (opcaoStr == null) {
                    JOptionPane.showMessageDialog(null, "Programa cancelado.");
                    break;
                }
                opcao = Integer.parseInt(opcaoStr);

                path = JOptionPane.showInputDialog("Digite o caminho da pasta");
                personagem = new DragonBallSuper();
                switch (opcao) {
                    case 1:
                        nome = JOptionPane.showInputDialog("Digite o nome do personagem");
                        personagem.setNome(nome);
                        ki = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de KI (poder) do personagem"));
                        personagem.setKi(ki);
                        tecnicas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de técnicas do personagem"));
                        personagem.setTecnicas(tecnicas);
                        velocidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade do personagem"));
                        personagem.setVelocidade(velocidade);
                        transformacoes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de transformações do personagem"));
                        personagem.setTransformacoes(transformacoes);
                        JOptionPane.showMessageDialog(null, personagem.gravar(path));
                        break;
                    case 2:
                        nome = JOptionPane.showInputDialog("Digite o nome do personagem");
                        personagem.setNome(nome);
                        personagem = personagem.ler(path);
                        if (personagem == null) {
                            JOptionPane.showMessageDialog(null, "Caminho e/ou nome do personagem de Dragon Ball Super informado inexistente");
                        } else {
                            JOptionPane.showMessageDialog(null, "Exibindo dados do personagem"
                                    + "\nArquivo: " + "/" + personagem.getNome() + ".txt"
                                    + "\nNome: " + personagem.getNome()
                                    + "\nKI: " + personagem.getKi()
                                    + "\nTécnicas: " + personagem.getTecnicas()
                                    + "\nVelocidade: " + personagem.getVelocidade()
                                    + "\nTransformações: " + personagem.getTransformacoes()
                            );
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Escolha incorreta!");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro de formato! Digite um número\nTipo de Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Acessar Arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa");
    }
}
