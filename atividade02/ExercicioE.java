package atividade02;

import javax.swing.JOptionPane;

public class ExercicioE {
	
	public static void main(String[] args) {
		int natural = 1;
		int multiplicador = 1;

		natural = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu número natural aqui: "));
		for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println(natural + "x" + multiplicador + "=" + natural * multiplicador);
		}
		
	}
	
	
	


}
