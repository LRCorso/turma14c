package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.beans.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		Aluno aluno = null;
		while (JOptionPane.showConfirmDialog
				(null, "Lan�ar um aluno?", "T�tulo", JOptionPane.YES_NO_OPTION)==0) {
			
			aluno = new Aluno();
			aluno.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
			aluno.setEmail(JOptionPane.showInputDialog("Email").toLowerCase());
			aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("RM")));
			System.out.println("Conferindo...");
			System.out.println(aluno.getAll());
			System.out.println("Usu�rio: " + aluno.getUsuario());
			
		}
	}

}
