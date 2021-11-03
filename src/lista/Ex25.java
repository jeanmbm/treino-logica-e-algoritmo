package lista;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar, imprimir o resultado desta operação. 
 * 
 * Make an algorithm that reads a variable and adds 5 if it is even or adds 8 if it is odd, print the result of this operation.
 * 
 */

public class Ex25 {

	public static void main(String[] args) {

		double value, result;
		boolean isEven = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor \n(Enter a value): ");
		value = scan.nextDouble();
		
		if (value % 2 == 0) {
			result = value + 5;
			isEven = true;
		} else {
			result = value + 8;
		}
		
		System.out.println();
		System.out.println((isEven) ? "Valor par. Resultado da operação: " + value + " + 5 = " + result : "Valor ímpar. Resultado da operação: " + value + " + 8 = " + result);
		System.out.println((isEven) ? "Even value. Operation result: " + value + " + 5 = " + result : "Odd value. Operation result: " + value + " + 8 = " + result);

	}

}
