package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Nome do Produto").toUpperCase();
		short qtde = Short.parseShort(JOptionPane.showInputDialog("Digite a Qtde em estoque"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de venda"));
		if (qtde <5) {
			System.out.println("Estoque Emergencial");
		}else

		if (qtde >20) {
			System.out.println("Estoque Alto");
		}else

		if (qtde >=10 && qtde <= 20) {
			System.out.println("Estoque M�dio");
		}else {
			System.out.println("Estoque Baixo");
		}
		
		System.out.println("O valor total do estoque �: R$" + qtde*valor);
		System.out.println("O valor total do estoque com desconto de 10% �: R$" + qtde*valor*0.9);

	}

}