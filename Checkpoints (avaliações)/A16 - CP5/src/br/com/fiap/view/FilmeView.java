package br.com.fiap.view;

import br.com.fiap.controller.FilmeController;

import javax.swing.*;

public class FilmeView {
    public static void main(String[] args) {
        String titulo, genero, produtora;
        String[] escolha = {"Inserir","Alterar","Excluir","Listar"};
        int codigo, opcao;
        FilmeController filmeController = new FilmeController();
        do {
            try {
                opcao = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo para gerenciar os Filmes:", "Gerenciar Filmes", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolha, escolha[0]);

                switch (opcao) {
                    case 0:
                        titulo = JOptionPane.showInputDialog("Título do Filme:");
                        genero = JOptionPane.showInputDialog("Gênero do Filme:");
                        produtora = JOptionPane.showInputDialog("Produtora do Filme:");
                        System.out.println(filmeController.inserirFilme(titulo, genero, produtora));
                        break;
                    case 1:
                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do Filme para Alterar:"));
                        titulo = JOptionPane.showInputDialog("Novo Título do Filme:");
                        genero = JOptionPane.showInputDialog("Novo Gênero do Filme:");
                        produtora = JOptionPane.showInputDialog("Nova Produtora do Filme:");
                        System.out.println(filmeController.alterarFilme(codigo, titulo, genero, produtora));
                        break;
                    case 2:
                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do Filme para Excluir:"));
                        System.out.println(filmeController.excluirFilme(codigo));
                        break;
                    case 3:
                        String filmes = filmeController.listarTodosFilmes();
                        JOptionPane.showMessageDialog(null, filmes);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa");
    }
}

