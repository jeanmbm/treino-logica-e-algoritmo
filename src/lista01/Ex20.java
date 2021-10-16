package lista01;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto. 
 * Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for 
 * maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.
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
		
		System.out.print("Digite a quantidade máxima do produto em estoque \n(Enter the maximum quantity of the product in stock): ");
		maxProduct = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Digite a quantidade mínima do produto em estoque \n(Enter the minimum quantity of the product in stock): ");
		minProduct = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Digite a quantidade atual do produto em estoque \n(Enter current quantity of product in stock): ");
		quantCurrent = scan.nextInt(); 
		
		avarage = (maxProduct + minProduct) / 2;
		
		System.out.println();
		System.out.println((quantCurrent >= avarage) ? "Não efetuar compra" : "Efetuar compra");
		System.out.println((quantCurrent >= avarage) ? "Do not purchase" : "Make purchase");
		
		
	}

}
