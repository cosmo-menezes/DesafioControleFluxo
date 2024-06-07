package br.com.dio.java.desafio_controle_fluxo;

import java.util.Scanner;

public class Contaor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o parâmetro Um:");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o parâmetro Dois");
		int parametroDois = terminal.nextInt();
		
		terminal.close();
		
		try {
			contar(parametroUm, parametroDois);
			} 
		catch (ParametrosInvalidosException exception)
		{
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
 
	}

	private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if(parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		System.out.println("Teremos " + contagem + " interações");
		
		for(int i = 1; i <= contagem; i++) {
			System.out.println("Número de interações: " + i);
		}
	}
	

}
