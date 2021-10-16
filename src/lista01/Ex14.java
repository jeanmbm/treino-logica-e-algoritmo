package lista01;

import java.util.Scanner;

/*
 * Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
 * 
 * Read two values (Consider that equal values will not be read) and write the largest of them.
 * 
 */

public class Ex14 {

	public static void main(String[] args) {
		
		double firstValue, secondValue;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor \n(Enter the first value): ");
		firstValue = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Informe o segundo valor \n(Enter the second value): ");
		secondValue = scan.nextDouble();
		
		System.out.println();
		System.out.println((firstValue > secondValue) ? "O maior valor é" + firstValue : "O maior valor é: " + secondValue);
		System.out.println((firstValue > secondValue) ? "The biggest value is: " + firstValue : "The biggest value is: " + secondValue);
		
	}

}
