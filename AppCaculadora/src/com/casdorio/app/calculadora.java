package com.casdorio.app;
import java.util.Scanner;
import java.util.InputMismatchException;

public class calculadora {
	
	
	static String operacao;
	
	static float primeiro_numero;
	static float segundo_numero;
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		try {
			System.out.print("Informe o primeiro numero: ");
			primeiro_numero = input.nextFloat();
			System.out.print("Informe o segundo numero: ");
			segundo_numero = input.nextFloat();
			
		} catch(InputMismatchException e) {
			System.out.println("[ERRO] É necessário informar um número!");
			input.close();
			return;
		}
		
		System.out.print("Selecione a operação desejada:\r\n"
						+ "[+] - Somar\r\n"
						+ "[-] - Subtrair\r\n"
						+ "[*] - Multiplicar\r\n"
						+ "[/] - Dividir\r\n"
						+ "Opção: "
				);
		operacao = input.next();
		
		System.out.println("Resultado: ");
		
		switch(operacao.toUpperCase()) {
		case "+":
			imprimir(primeiro_numero + segundo_numero);
			break;
		case "-":
			imprimir(primeiro_numero - segundo_numero);
			break;
		case "*":
			imprimir(primeiro_numero * segundo_numero);
			break;
		case "/":
			imprimir(primeiro_numero / segundo_numero);
			break;
		default:
			System.out.println("Operação invalida!");
		}
		input.close();

	}

	
	public static void imprimir(float result) {
		System.out.println("%.2f %s %.2f = %.2f".formatted(primeiro_numero, operacao, segundo_numero, result));  
	}

}
