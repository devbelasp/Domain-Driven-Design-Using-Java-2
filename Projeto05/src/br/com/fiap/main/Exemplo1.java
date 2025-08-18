package br.com.fiap.main;

public class Exemplo1 {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 1;
        }catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero!\n" + e.getMessage());
        } finally {
            System.out.println("Finally executado!");
        }
    }
}
