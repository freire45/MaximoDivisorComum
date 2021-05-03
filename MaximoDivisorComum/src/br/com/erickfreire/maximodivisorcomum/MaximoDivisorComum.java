package br.com.erickfreire.maximodivisorcomum;

import java.util.Scanner;

/**
 * Programa em Java que calcula o máximo divisor comum
 * @author Erick Freire
 * @version 1 - Criado em 03-05-2021 as 18:04
 */

public class MaximoDivisorComum {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que calcula o Maximo divisor comum (MDC)");
		
		System.out.print("Informe o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		numero2 = entrada.nextInt();
		
		calculaMDC(numero1, numero2);
	}
	
	public static void calculaMDC(int n1, int n2) {
		
		int maior;
		int val = 0;
		
		if(n1 > n2) {
			maior = n1;
		} else {
			maior = n2;
		}
		
		for(int i = 1; i <= maior; i++) {
			if(n1 % i == 0 && n2 % i == 0) {
				val = i;
			}
		}
		
		System.out.printf("%n%nO MDC é : %d%n", val);
		
		
	}

}
