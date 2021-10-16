package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

/* 
 * Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
 * 
 * Write an algorithm to read the dimensions of a rectangle (base and height), calculate and write the area of the rectangle. 
 * 
 */

public class Ex02 {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.##");
		
		System.out.print("Digite o valor da base do triâgulo \n(Enter the base value of the triangle): ");
		double base = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Digite o valor da altura do triâgulo \n(Enter the height value of the triangle): ");
		double height = scan.nextDouble();
		
		double area = (base * height) / 2;
		
		System.out.println();
		System.out.println("A área do triâgulo é " + format.format(area));
		System.out.println("The area of ​​the triangle is " + format.format(area));
		

	}

}
