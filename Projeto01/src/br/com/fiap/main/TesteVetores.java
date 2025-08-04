package br.com.fiap.main;

public class TesteVetores {
    public static void main(String[] args) {
        String[] carros = {"Volvo", "BMW", "Mazda", "Ford"};
        System.out.println(carros.length);

        int[] numeros = new int [4];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        //System.out.println(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        //for-each
        for (String i : carros) {
            System.out.println(i);
        }
    }
}

