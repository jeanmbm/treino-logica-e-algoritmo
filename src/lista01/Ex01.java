package lista01;

import java.util.Scanner;

/* 
 * Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
 * 
 * Write an algorithm to read a value (from the keyboard) and write (on the screen) its predecessor. 
 * 
 */

public class Ex01 {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número \n(Enter a number): ");
		int number = scan.nextInt();
		
		int predecessor = number - 1;
		
		System.out.println();
		System.out.println("Seu antecessor é " + predecessor);
		System.out.println("Your predecessor is " + predecessor);
		
	}

}
