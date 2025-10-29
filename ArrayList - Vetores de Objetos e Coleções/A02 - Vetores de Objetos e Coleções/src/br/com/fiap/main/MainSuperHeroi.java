package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class MainSuperHeroi {

	public static void main(String[] args) {
		SuperHeroi super1;
		String nome, idSecreta, auxiliar;
		do {
			try {
				nome = JOptionPane.showInputDialog("Nome do Herói");
				idSecreta = JOptionPane.showInputDialog("Identidade Secreta");
				String itemLista = "continua";
				ArrayList<String> poderes = new ArrayList<String>();
				while (itemLista.equalsIgnoreCase("continua")) {
					auxiliar = JOptionPane.showInputDialog("Digite o poder deste herói ou \"fim\" para encerrar");
					if (auxiliar.equalsIgnoreCase("fim")) {
						itemLista = "fim";
					} else {
						poderes.add(auxiliar);
					}
				}
				itemLista = "continua";
				ArrayList<String> fraquezas = new ArrayList<String>();
				while (itemLista.equalsIgnoreCase("continua")){
					auxiliar = JOptionPane.showInputDialog("Digite a fraqueza deste herói ou \"fim\" para encerrar");
					if (auxiliar.equalsIgnoreCase("fim")) {
						itemLista = "fim";
					} else {
						fraquezas.add(auxiliar);
					}
				}
				super1 = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
				super1.listarHeroi();
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
			}
		} while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) == 0);
		JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);
	}
}
