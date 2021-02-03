package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Produto;

public class ImplementarEcommerce {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("ID")), 
				JOptionPane.showInputDialog("Descri��o").toUpperCase(), 
				Float.parseFloat(JOptionPane.showInputDialog("Venda")), 
				Float.parseFloat(JOptionPane.showInputDialog("Compra")), 
				Integer.parseInt(JOptionPane.showInputDialog("Qtde"))
				);
		produto.atualizarValores(10);
		System.out.println(produto.toString());
		System.out.println("Total Compra: " + produto.getTotalCompra());
		System.out.println("Total Venda: " + produto.getTotalVenda());
	}


}
