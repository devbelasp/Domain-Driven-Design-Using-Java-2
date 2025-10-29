package br.com.fiap.bean;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class SuperHeroi {
	// atributos
	private String nome;
	private String idSecreta;
	private ArrayList<String> poderes;
	private ArrayList<String> fraquezas;
	// construtores
	public SuperHeroi() {}
	public SuperHeroi(String nome, String idSecreta, ArrayList<String> poderes, ArrayList<String> fraquezas) {
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
	public ArrayList<String> getPoderes() {
		return poderes;
	}
	public void setPoderes(ArrayList<String> poderes) {
		this.poderes = poderes;
	}
	public ArrayList<String> getFraquezas() {
		return fraquezas;
	}
	public void setFraquezas(ArrayList<String> fraquezas) {
		this.fraquezas = fraquezas;
	}
	// métodos particulares da classe
	public void listarHeroi() {
		String exibe = String.format("Nome do herói: %s \n", nome);
		exibe += String.format("Identidade secreta: %s \n", idSecreta);
		Collections.sort(poderes);
		int cont = 1;
		for(String i : poderes) {
			exibe += String.format("Poder %d: %s \n", cont, i);
			cont++;
		}
		Collections.sort(fraquezas);
		cont = 1;
		for(String i : fraquezas) {
			exibe += String.format("Fraqueza %d: %s \n", cont, i);
			cont++;
		}
		JOptionPane.showMessageDialog(null, exibe, "Listagem do Herói", JOptionPane.INFORMATION_MESSAGE);
	}
}

