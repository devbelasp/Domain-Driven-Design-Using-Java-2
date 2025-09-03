package br.com.fiap.main;

import br.com.fiap.bean.Calculadora;

import javax.swing.JOptionPane;

public class UsaCalculadora {

	public static void main(String[] args) {
		String aux;
		float num1, num2;
		int opcao;
		do {
			try {
				aux = JOptionPane.showInputDialog("Digite 1º número real");
				num1 = Float.parseFloat(aux);
				aux = JOptionPane.showInputDialog("Digite 2º número real");
				num2 = Float.parseFloat(aux);
				Calculadora calc = new Calculadora();
				calc.setNumero1(num1);
				calc.setNumero2(num2);
				aux = JOptionPane.showInputDialog("""
                        Escolha a operação:

                        (1) soma
                        (2) subtração
                        (3) multiplicação
                        (4) divisão""");
				opcao = Integer.parseInt(aux);
				switch (opcao) {
				case 1:
					JOptionPane.showMessageDialog(null, "SOMA:\n" + calc.adicao());
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "SUBTRAÇÃO:\n" + calc.subtracao());
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "MULTIPLICAÇÃO:\n" + calc.multiplicacao());
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "DIVISÃO:\n" + calc.divisao());
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Erro de Conversão!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
			} catch (ArithmeticException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
			}
		} while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		JOptionPane.showMessageDialog(null, "Fim de Programa!");
	}
}
