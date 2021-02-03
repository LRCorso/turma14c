package br.com.elevador.teste;

import br.com.concessionaria.modelo.Veiculo;

public class TesteElevador {

	public static void main(String[] args) {
		// Instanciando um objeto
		Veiculo objeto = new Veiculo();
		objeto.preencherModelo("uno");
		objeto.preencherPlaca("clp4520");
		objeto.preencherValor(500);
		objeto.preencherStatus("sim");
		objeto.preencherVelocidadeAtual(40);
		
		System.out.println(objeto.retornarModelo());
		System.out.println(objeto.retornarPlaca());
		System.out.println(objeto.retornarValor());
		System.out.println(objeto.retornarStatus());
		System.out.println(objeto.retornarVelocidadeAtual());

	}

}
