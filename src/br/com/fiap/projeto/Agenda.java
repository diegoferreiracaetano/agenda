package br.com.fiap.projeto;
import java.util.List;

/**
 * Classe Agenda contem todos os métodos 
 * Diego Ferreira Caetano<diegofcaetano@hotmail.com>
 * 11/05/2014
 */
public class Agenda {
	private int id;
	private String nome;
	private String telefone;
	
	/**
	 * Construtor vazio
	 * Diego Ferreira Caetano<diegofcaetano@hotmail.com>
	 * 11/05/2014
	 */
	public Agenda() {
	}
	
	/**
	 * Construtor com todos os paramentros 
	 * Diego Ferreira Caetano<diegofcaetano@hotmail.com>
	 * 11/05/2014
	 * @param id
	 * @param nome
	 * @param telefone
	 */
	public Agenda(int id, String nome, String telefone) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}

	/**
	 * retorno lista de todos os contatos da agenda
	 * Diego Ferreira Caetano<diegofcaetano@hotmail.com>
	 * 11/05/2014
	 * @return
	 */
	public List<Agenda> listar(){
		return null;
	}
	
	/**
	 * Adiciona um contato
	 * Diego Ferreira Caetano<diegofcaetano@hotmail.com>
	 * 11/05/2014
	 */
	public void adicionar(){
				
	}
	
	/**
	 * edita um contato
	 * Diego Ferreira Caetano<diegofcaetano@hotmail.com>
	 * 11/05/2014
	 */
	public void editar(){
				
	}
	
	/**
	 * exclui um contato
	 * Diego Ferreira Caetano<diegofcaetano@hotmail.com>
	 * 11/05/2014
	 */
	public void excluir(){
			
	} 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
