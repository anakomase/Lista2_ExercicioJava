package atividade02;

import javax.swing.JOptionPane;

public class ExercicioA {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		int acumulador = 0;
		
		for (int i = 0; i < n; i++) {
            acumulador += i;
        }
        double media = acumulador / n;
        
        System.out.println(media);
		
	}

}
