package br.com.fiap.main;

import java.util.HashMap;
import java.util.Map;

public class NavegaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoa = new HashMap<String, Integer>();
        pessoa.put("Astrogildo", 18);
        pessoa.put("Berisvaldo", 25);
        pessoa.put("Gumercindo", 18);
        //System.out.println(pessoa);
        for (Map.Entry<String, Integer> i : pessoa.entrySet()) {
            System.out.println("Chave:" + i.getKey() + "\nValor:" + i.getValue());
        }
    }
}
