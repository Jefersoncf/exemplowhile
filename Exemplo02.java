package aula28;

import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {

		/*
		 * O PROGRAMA VAI LER UMA LISTA DE PRODUTOS E IMPRIR TODOS NO FINAL*/
		ArrayList<String> produtos = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("LISTE SEUS ITENS, OU PARA SAIR DIGITE (FIM)");
		
		String produto;
		
		while (!"FIM".equals(produto = sc.nextLine())) { // O (!) ESTÁ NEGANDO A OPERAÇÃO 
			produtos.add(produto);
		}
		System.out.println(produtos.toString());
	}

}
