package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static Connection connection;

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar a conexão: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                return connection;
            }

            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = System.getenv("DB_URL");
            String user = System.getenv("DB_USER") ;
            String password = System.getenv("DB_PASSWORD");
            if (url == null || user == null || password == null) {
                throw new RuntimeException("Variáveis de ambiente do banco não configuradas");
            }

            connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            throw new RuntimeException("Erro de SQL (Conexão Falhou): " + e.getMessage(), e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Erro nome da classe (Driver Ausente): " + e.getMessage(), e);
        }

        return connection;
    }
}