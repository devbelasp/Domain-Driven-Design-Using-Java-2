package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;
import java.sql.Connection;

public class TesteCreate {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();
        Carro carro = new Carro();
        CarroDAO carroDAO = new CarroDAO(con);
        carro.setPlaca("JKK1600");
        carro.setCor("Vermelho");
        carro.setDescricao("Polo");
        System.out.println(carroDAO.inserir(carro));
        ConnectionFactory.fecharConexao(con);
    }
}
