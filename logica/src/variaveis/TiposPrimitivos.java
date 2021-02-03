package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
	/*
	 * Capturar:
	 * - marca da televisão
	 * - valor da televisão
	 * - qtd de polegadas
	 * - voltagem
	 * - qtde em estoque
	 */
		
	String marca = JOptionPane.showInputDialog("Marca");
	float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
	short polegadas = Short.parseShort(JOptionPane.showInputDialog("Polegadas"));
	short voltagem = Short.parseShort(JOptionPane.showInputDialog("Voltagem"));
	byte qtde = Byte.parseByte(JOptionPane.showInputDialog("Estoque"));
	System.out.println(marca);
	System.out.println(valor);
	System.out.println(polegadas);
	System.out.println(voltagem);
	System.out.println(qtde);
	
	
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
