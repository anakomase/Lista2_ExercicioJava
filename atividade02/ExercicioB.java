package atividade02;

import javax.swing.JOptionPane;

public class ExercicioB {
	public static void main(String[] args) {
		double valoresNaturais = 0;
		int totalDeValoresNaturaisInseridos = 0;
		int valorNaturalAtual;
		double mediaaritmetica;

		do {

			valorNaturalAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira seu valor natural aqui"));
			valoresNaturais = valoresNaturais + valorNaturalAtual;
			 totalDeValoresNaturaisInseridos++;
		} while (valorNaturalAtual != 0);

		mediaaritmetica = valoresNaturais /  totalDeValoresNaturaisInseridos;

		JOptionPane.showInputDialog(null, "valores naturais s�o " + valoresNaturais);
		JOptionPane.showInputDialog(null, "total de valores naturais inseridos � " +  totalDeValoresNaturaisInseridos);
		JOptionPane.showInputDialog(null, "A M�dia Aritm�tica �: " + mediaaritmetica);

		
	}
}
