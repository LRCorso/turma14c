package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		/*
		 * Capturar:
		 * nome da disciplina:
		 * duas notas:
		 * calcular a media aritimetica:
		 * exibir a media e o nome da disciplina:
		 */

		String disciplina = JOptionPane.showInputDialog("Nome da Disciplina").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade faltas"));
		if (faltas >=20) {
			System.out.println("Reprovado por faltas");
		} else {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota2"));

			float media = (nota1 + nota2)/2;
			if (media >=6) {
				System.out.println("Parab�ns voce est� aprovado!!!!");
			}else

				if (media <=4) {
					System.out.println("Infelizmente voce foi reprovado!!!!");
				}else {
					System.out.println("Voce est� de exame!");
				}

			System.out.println("A m�dia � " + media + " na disciplina: " + disciplina);

		}

	}
}
