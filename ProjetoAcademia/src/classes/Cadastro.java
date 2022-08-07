package classes;

import java.io.Serializable;

public class Cadastro implements Serializable {
	private String nome;
	private String cpf;
	private String tipoplano;
	private String login;
	private String senha;
	
	//construtor
	

	public Cadastro(String nome, String tipoplano, String login, String senha, String cpf) {
		super();
		this.nome = nome;
		this.tipoplano = tipoplano;
		this.login = login;
		this.senha = senha;
		this.cpf = cpf;
	}

	public Cadastro() {
		
	}
	
	
	
	
	public String mostrarDados() {
		return "- Nome: "+ this.nome + "\n    CPF: "+ this.cpf + "\n    Tipo do Plano: "+ this.tipoplano;
	}
	
	//getters
	public String getLogin() {
			return login;
		}
	public String getSenha() {
		return senha;
	}

	public String getNome() {
		return nome;
	}

	public String getTipoplano() {
		return tipoplano;
	}

	public String getCpf() {
		return cpf;
	}
	
}
