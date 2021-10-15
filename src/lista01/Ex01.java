package lista01;

import java.util.Scanner;

/* 
 * Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
 * 
 * Write an algorithm to read a value (from the keyboard) and write (on the screen) its predecessor. 
 * 
 */

public class Ex01 {
	
	static Scanner scan;

	public static void main (String [] args) {
		
		scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int number = scan.nextInt();
		
		int predecessor = number - 1;
		
		System.out.println("Seu antecessor é " + predecessor);
		
	}

}
