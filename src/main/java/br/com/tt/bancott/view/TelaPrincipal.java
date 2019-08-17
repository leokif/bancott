package br.com.tt.bancott.view;

import java.util.Scanner;

public class TelaPrincipal {



	public void imprimirMenu() {

		Scanner scanner = new Scanner(System.in);
			int opcaoUsuario = scanner.nextInt();
			do {
		
				mostrarMenu();
	
										
		switch(opcaoUsuario) {
		
			case 1 :
				TelaCorrentista telaCorrentista = new TelaCorrentista();
				telaCorrentista.abrirTela();
			
			
			
				break;
			case 2 :
				System.out.println("Tela Movimento");
			
			
			
			
			
				break;
			case 0 :
				
				System.out.println("Encerrar Programa");
				
				
				scanner.close();
				System.exit(0);
				break;	
		
			default:
				System.out.println("Opção Invalida!");
		}	
			}while(true);
		
		private void mostrarMenu() {
			
			System.out.println("=================TELA PRINCIPAL===============");
			System.out.println("Digite");
			System.out.println(" - [1]para Tela Correntista");
			System.out.println(" - [2]para Tela Movimento");
			System.out.println(" - [0] para encerrar programa");
			System.out.println("------------------------------");	
			
		}			
			
		}
		
			
	}
		
		
		
		
				
	














}
