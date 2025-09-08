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

        cliente.setIdCliente(5);
        cliente.setNomeCliente("João");
        cliente.setPlaca("JKK1700");
        System.out.println(clienteDAO.inserir(cliente));

        cliente.setIdCliente(6);
        cliente.setNomeCliente("Betina");
        cliente.setPlaca("JKK1800");
        System.out.println(clienteDAO.inserir(cliente));

        cliente.setIdCliente(7);
        cliente.setNomeCliente("Thaina");
        cliente.setPlaca("JKK1600");
        System.out.println(clienteDAO.inserir(cliente));

        cliente.setIdCliente(8);
        cliente.setNomeCliente("Maria");
        cliente.setPlaca("JKK1902");
        System.out.println(clienteDAO.inserir(cliente));

        //update
        cliente.setNomeCliente("Maria Joana");
        cliente.setPlaca("JKK1902");
        cliente.setIdCliente(8);
        System.out.println(clienteDAO.alterar(cliente));

        //delete
        cliente.setIdCliente(8);
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
