package decisao;

import javax.swing.JOptionPane;

public class DeafioDecisaoSimple {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite Idade"));
		if (idade >=18 && idade <= 70) {
			System.out.println(nome + ", voce � obrigado a votar");
		}
		if (idade <16) {
			System.out.println(nome + ", voce ainda n�o pode votar");
		}
		if (idade==16 ||  idade==17 || idade > 70) {
			System.out.println(nome + ", seu voto � facultativo");
		}
	}

}
