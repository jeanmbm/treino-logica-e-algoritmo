package lista;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia um número e informe se ele é divisível por 10, por 5 ou por 2 ou se não é divisível por nenhum deles.
 * 
 * Write an algorithm that reads a number and tells you whether it is divisible by 10, by 5, or by 2, or if it is not divisible by any of them.
 * 
 */

public class Ex23 {

	public static void main(String[] args) {

		double value;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor \n(Enter a value): ");
		value = scan.nextDouble();
		
		System.out.println();
		
		if (value % 10 == 0) {
			System.out.println("Este valor é divisível por 10");
			System.out.println("This value is divisible by 10");
		} else if (value % 5 == 0) {
			System.out.println("Este valor é divisível por 5");
			System.out.println("This value is divisible by 5");
		} else if (value % 2 == 0) {
			System.out.println("Este valor é divisível por 2");
			System.out.println("This value is divisible by 2");
		} else {
			System.out.println("Este valor não é divisível por 10, 5 ou 2");
			System.out.println("This value isn't divisible by 10, 5 ou 2");
		}

	}

}
