package br.com.universidade.beans;

public class Aluno {
	
	private int rm;
	private String email;
	private String nome;
	
	public void setAll(int rm, String email, String nome) {
		this.rm=rm;
		this.email=email;
		this.nome=nome;
	}
	
	public String getUsuario() {
		if (email.contains("@")) {
			return email.substring(0,email.indexOf("@"));
		}
		return email;
	}
	
	public String getAll() {
		return "RM: " + getRm() + "\nNome: " + nome + "\nEmail: " + email;
	}
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
