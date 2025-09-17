package br.com.fiap.main;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;
import java.util.ArrayList;

public class TesteClienteCRUD {
    public static void main(String[] args) {
        //create
        Connection con = ConnectionFactory.abrirConexao();
        Cliente cliente = new Cliente();
        ClienteDAO clienteDAO = new ClienteDAO(con);

        cliente.setIdCliente(1);
        cliente.setNomeCliente("Astrogildo");
        cliente.setPlaca("JKK1900");
        System.out.println(clienteDAO.inserir(cliente));

        cliente.setIdCliente(2);
        cliente.setNomeCliente("Berisvaldo");
        cliente.setPlaca("JKK1901");
        System.out.println(clienteDAO.inserir(cliente));

        cliente.setIdCliente(3);
        cliente.setNomeCliente("Gumercindo");
        cliente.setPlaca("JKK1902");
        System.out.println(clienteDAO.inserir(cliente));

        cliente.setIdCliente(4);
        cliente.setNomeCliente("Pafúncia");
        cliente.setPlaca("JKK1903");
        System.out.println(clienteDAO.inserir(cliente));

        //update
        cliente.setIdCliente(4);
        cliente.setNomeCliente("Josenelson");
        cliente.setPlaca("JKK1903");
        System.out.println(clienteDAO.alterar(cliente));

        //delete
        cliente.setIdCliente(4);
        System.out.println(clienteDAO.excluir(cliente));

        //read
        ArrayList<Cliente> resultado = clienteDAO.listarTodos();
        if (resultado != null) {
            for (Cliente cliente1 : resultado) {
                System.out.println("Id: " + cliente1.getIdCliente());
                System.out.println("Nome: " + cliente1.getNomeCliente());
                System.out.println("Placa: " + cliente1.getPlaca());
                System.out.println();
            }
        }
        ConnectionFactory.fecharConexao(con);
    }
}
