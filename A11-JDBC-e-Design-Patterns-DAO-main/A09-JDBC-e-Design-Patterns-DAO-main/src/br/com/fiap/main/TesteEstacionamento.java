package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import javax.swing.*;
import java.sql.Connection;
import java.util.ArrayList;

public class TesteEstacionamento {
    public static void main(String[] args) {
        int opcao;
        CarroDAO carroDao;
        ClienteDAO clienteDAO;

        //loop que pergunta se deseja continuar
        do {
            try {
                //Menu de escolha
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha quem deseja manipular\n(1) Carro\n(2) Cliente"));
                Connection con = ConnectionFactory.abrirConexao();
                switch (opcao) {
                    case 1: // manipular Carro
                       carroDao = new CarroDAO(con);
                       carroDao.manipularCarro();
                       ArrayList<Carro> resultado = carroDao.listarTodos();
                        if (resultado != null) {
                            for (Carro carro : resultado) {
                                System.out.printf("\nPlaca: %s\nCor: %s\nDescrição: %s\n----------------------\n", carro.getPlaca(), carro.getCor(), carro.getDescricao());
                            }
                        }
                        break;
                    case 2: // manipular Cliente
                        clienteDAO = new ClienteDAO(con);
                        clienteDAO.manipularCliente();
                        ArrayList<Cliente> resultado2 = clienteDAO.listarTodos();
                        if (resultado2 != null) {
                            for (Cliente cliente : resultado2) {
                                System.out.printf("\nId: %d\nNome: %s\nPlaca: %s\n----------------------\n", cliente.getIdCliente(), cliente.getNomeCliente(), cliente.getPlaca());
                            }
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Escolha incorreta!");
                }
                ConnectionFactory.fecharConexao(con);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro de formato! Digite um número\nTipo de Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        }
    } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa");
}
}
