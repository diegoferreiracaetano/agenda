package br.com.fiap.projeto;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int opcao;

		System.out.println("##############################");
		System.out.println("##### Agenda de Contatos #####");
		System.out.println("##############################");
		System.out.println();
		
		System.out.println("Selecione a opção desejada:");
		System.out.println("1- para listar");
		System.out.println("2- para incluir");
		System.out.println("3- para alterar");
		System.out.println("4- para excluir");
		
		opcao = ler.nextInt();

		switch (opcao) {
		case 1:
			agenda.listar();
			break;
		case 2:
			agenda.inserir();
			break;
		case 3:
			agenda.editar();
			break;
		case 4:
			agenda.excluir();
			break;
		}

	}

}
