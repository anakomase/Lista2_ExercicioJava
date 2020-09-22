package atividade02;

import javax.swing.JOptionPane;

public class ExercicioC {

	public static void main(String[] args) {
		int limiteSuperior;
		int resultado = 1;
		int multiplicador = 1;
		int multiplicadorAnterior = 0;

		limiteSuperior = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número Natural aqui: "));
		while (resultado <= limiteSuperior) {
			multiplicadorAnterior = multiplicador;
			multiplicador++;
			resultado = multiplicador * multiplicador;
		}

		JOptionPane.showMessageDialog(null,"O Número natural que mais se aproxima da raiz quadrada mencionada é: " + multiplicadorAnterior);
	}

}
