package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoEncadeada2 {

	public static void main(String[] args) {
		
		String cidade = JOptionPane.showInputDialog("Cidade").toUpperCase();
		float idh = Float.parseFloat(JOptionPane.showInputDialog("IDH"));
		long populacao = Long.parseLong(JOptionPane.showInputDialog("Populacao"));
		if (populacao>200000) {
			if (idh>0.9) {
				System.out.println(cidade + " perfeita!");
			}else if(idh<0.75) {
				System.out.println(cidade + " precisa de cuidados!");
			}else {
				System.out.println(cidade + " � uma boa cidade.");
			}
		}else {
			if (idh<0.85) {
				System.out.println(cidade + " precisa de cuidados!");
			}else {
				System.out.println(cidade + " � uma boa cidade.");
			      }
		    }

	}
}

	
