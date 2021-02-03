package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		char resposta=0;
		int num1=0;
		int num2=0;
	
		do {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2"));
			System.out.println("Resultado: " + (num1+num2));
			}while(JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase().charAt(0)=='S');

	}
}


