package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Collections;

public class TesteArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(17);
        numeros.add(48);
        numeros.add(5);
        numeros.add(99);
        numeros.add(23);
        System.out.println("ArrayList Original");
        for (Integer i : numeros) {
            System.out.print(String.format("%d ", i));
        }
        // Ordenando um ArrayList com o metodo .sort() da classe Collections
        Collections.sort(numeros);
        System.out.println("\nArrayList Ordenado");
        for (Integer i : numeros) {
            System.out.print(String.format("%d ", i));
        }
    }
}
