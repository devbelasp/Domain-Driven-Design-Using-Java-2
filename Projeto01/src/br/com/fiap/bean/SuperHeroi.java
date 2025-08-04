package br.com.fiap.bean;

import javax.swing.*;

public class SuperHeroi {
    // atributos
    private String nome;
    private String idSecreta;
    private String[] poderes;
    private String[] fraquezas;
    // construtores
    public SuperHeroi() {}
    public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
        this.nome = nome;
        this.idSecreta = idSecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }
    // métodos getters/setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIdSecreta() {
        return idSecreta;
    }
    public void setIdSecreta(String idSecreta) {
        this.idSecreta = idSecreta;
    }
    public String[] getPoderes() {
        return poderes;
    }
    public void setPoderes(String[] poderes) {
        this.poderes = poderes;
    }
    public String[] getFraquezas() {
        return fraquezas;
    }
    public void setFraquezas(String[] fraquezas) {
        this.fraquezas = fraquezas;
    }
    // métodos da classe (particulares)
    public void listarHeroi() {
        String exibe = String.format("Nome do super-herói: %s \n Nome da ID Secreta: %s \n", nome, idSecreta);
        int cont = 1;
        for (String i :poderes) {
            exibe += String.format("Poder %d: %s \n", cont, i);
            cont++;
        }
        cont = 1;
        for (String i :fraquezas) {
            exibe += String.format("Fraqueza %d: %s \n", cont, i);
            cont++;
        }
        JOptionPane.showMessageDialog(null, exibe, "Informações do super-herói", JOptionPane.INFORMATION_MESSAGE);
    }
}
