package br.com.fiap.main;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        // declaração e instanciação de objetos da classe ArrayList
        ArrayList<String> carros = new ArrayList<String>();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        // preencher um ArrayList com o metodo .add()
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Mazda");
        System.out.println("Tamanho do ArrayList: " + carros.size());
        System.out.println("Mostrando valor do índice 1: " + carros.get(1));
        // Trocando um valor com metodo .set()
        carros.set(1, "Volkswagen");
        System.out.println("Mostrando valor do índice 1: " + carros.get(1));
        // Removendo um valor com o metodo .remove(indice)
        carros.remove(1);
        // removendo/limpando todos os itens do meu ArrayList com o metodo .clear()
        carros.clear();

        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }


    }
}
