package lista01;

import java.util.Scanner;

/*
 * Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em estoque e quantidade m�nima em estoque de um produto. 
 * Calcular e escrever a quantidade m�dia ((quantidade m�dia = quantidade m�xima + quantidade m�nima)/2). Se a quantidade em estoque for 
 * maior ou igual a quantidade m�dia escrever a mensagem 'N�o efetuar compra', sen�o escrever a mensagem 'Efetuar compra'.
 * 
 * Make an algorithm to read: current quantity in stock, maximum quantity in stock and minimum quantity in stock of a product. 
 * Calculate and write the average quantity ((average quantity = maximum quantity + minimum quantity)/2). If the quantity in stock is 
 * greater than or equal to the average quantity, write the message 'Do not make purchase', otherwise write the message 'Make purchase'.
 * 
 */

public class Ex20 {

	static Scanner scan;
	
	public static void main(String[] args) {
		
		int maxProduct, minProduct, quantCurrent, avarage;
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade m�xima do produto em estoque");
		maxProduct = scan.nextInt();
		
		System.out.println("Digite a quantidade m�nima do produto em estoque");
		minProduct = scan.nextInt();
		
		System.out.println("Digite a quantidade atual do produto em estoque");
		quantCurrent = scan.nextInt(); 
		
		
		
	}

}
