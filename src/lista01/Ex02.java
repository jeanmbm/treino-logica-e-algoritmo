package lista01;

import java.util.Scanner;

/* 
 * Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a �rea do ret�ngulo.
 * 
 * Write an algorithm to read the dimensions of a rectangle (base and height), calculate and write the area of the rectangle. 
 * 
 */

public class Ex02 {
	
	static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.print("Digite o valor da base do triangulo: ");
		double base = scan.nextDouble();
		
		System.out.print("Digite o valor da altura do triangulo: ");
		double height = scan.nextDouble();
		
		double area = (base * height) / 2;
		
		System.out.println("A �rea do trinagulo � " + area);

	}

}
