package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import javax.swing.*;
import java.io.IOException;

public class UsaPessoa {
    public static void main(String[] args) {
        String codigo, nome, email, path;
        int opcao;
        Pessoa pessoa;
        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha\n(1) Cadastrar\n(2) Consultar"));

                path = JOptionPane.showInputDialog("Digite o caminho da pasta");
                pessoa = new Pessoa();
                switch (opcao) {
                    case 1:
                        codigo = JOptionPane.showInputDialog("Digite o código");
                        nome = JOptionPane.showInputDialog("Digite o nome");
                        email = JOptionPane.showInputDialog("Digite o e-mail");
                        pessoa.setCodigo(codigo);
                        pessoa.setNome(nome);
                        pessoa.setEmail(email);
                        JOptionPane.showMessageDialog(null, pessoa.gravar(path));
                        break;
                    case 2:
                        codigo = JOptionPane.showInputDialog("Digite o código");
                        pessoa.setCodigo(codigo);
                        pessoa = pessoa.ler(path);
                        if (pessoa == null) {
                            JOptionPane.showMessageDialog(null, "Caminho e/ou código informado inexistente");
                        } else {
                            JOptionPane.showMessageDialog(null, "Exibindo dados"
                                    + "\nCaminho: " + path
                                    + "\nArquivo: " + "/" + pessoa.getCodigo() + ".txt"
                                    + "\nCódigo: " + pessoa.getCodigo()
                                    + "\nNome: " + pessoa.getNome()
                                    + "\nE-mail: " + pessoa.getEmail());
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Escolha incorreta!");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro de Conversão: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Acessar Arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa");
    }
}
