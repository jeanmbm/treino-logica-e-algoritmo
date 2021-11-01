package lista;

import java.util.Scanner;

/*
 * Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
 * 
 * Read a value and write if it is positive or negative (consider zero value as positive).
 * 
 */

public class Ex10 {

	public static void main(String[] args) {
		
		double value;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o valor \n(Enter the value): ");
		value = scan.nextDouble();
		
		System.out.println();
		System.out.println((value >= 0) ? "O valor é positivo" : "O valor é negativo");
		
	}
	
}
