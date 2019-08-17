package br.com.tt.bancott.view;

import java.util.Scanner;

public class TelaCorrentista {
	
	public void abrirTela() {
		
		Scanner scanne = new Scanner(System.in);
		
	
		
		do {
			this.imprimirMenu();
			
			int opcaoUsuario = scanner.nextInt();
			switch(opcaoUsuario) {
			
			case 1:
				System.out.println("Cadastrar correntista");
				
				
				break;
			case 2 :
				
				System.out.println("Listar correntistas!");
				
				break;
				
			case 0 :
				
				System.out.println("Encerrar programa!");
				
				break;
			default :
				
				
				
				
				
				break;
			
			}
			
	
		}while(true);	
		
	}
		
	private void imprimirMenu() {
		
		System.out.println("=================TELA PRINCIPAL===============");
		System.out.println("Digite");
		System.out.println(" - [1]para Cadastrar Correntista");
		System.out.println(" - [2]para Listar Correntistas");
		System.out.println(" - [0] para Retornar a Tela Principal");
		System.out.println("------------------------------");	
		
		
	

	

}













}
