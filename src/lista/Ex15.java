package lista;

import java.util.Scanner;

/*
 * Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.
 * 
 * Read two values (consider that equal values will not be read) and write them in ascending order.
 * 
 */

public class Ex15 {

	public static void main(String[] args) {
		
		double firstValue, secondValue;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor \n(Enter the first value): ");
		firstValue = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Informe o segundo valor \n(Enter the second value): ");
		secondValue = scan.nextDouble();
		
		System.out.println();
		System.out.println((firstValue > secondValue) ? "Ordem crescente: " + secondValue + ", " + firstValue : "Ordem crescente: " + firstValue + ", " + secondValue);
		System.out.println((firstValue > secondValue) ? "Ascending order: " + secondValue + ", " + firstValue : "Ascending order: " + firstValue + ", " + secondValue);
		
	}

}
