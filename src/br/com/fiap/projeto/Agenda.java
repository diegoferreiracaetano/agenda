package br.com.fiap.projeto;
import java.util.List;


public class Agenda {
	private String nome;
	private String telefone;
	
	public Agenda() {
		super();
	}
	
	public Agenda(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	
	public List<Agenda> listar(){
		return null;
	}
	
	public void inserir(){
				
	}
	
	public void editar(){
				
	}
	
	public void excluir(){
			
	} 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
