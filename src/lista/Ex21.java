package lista;

import java.util.Scanner;

/*
 * Fa�a um algoritmo que leia 2 valores num�ricos e um s�mbolo. Caso o s�mbolo seja um dos relacionados abaixo 
 * efetue a opera��o correspondente com os valores.
 * �+� opera��o de soma  |  �-� opera��o de subtra��o  |  �*� opera��o de multiplica��o  |  �/� opera��o de divis�o
 * 
 * Make an algorithm that reads 2 numeric values and a symbol. If the symbol is one of those listed below
 * perform a corresponding operation on the value.
 * �+� sum operation  |  �-� subtraction operation  |  �*� multiplication operation  |  �/� division operation
 * 
 */

public class Ex21 {

	public static void main(String[] args) {

		double firstValue, secondValue, result = 0;
		String symbol;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor \n(Insert the first value): ");
		firstValue = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Digite o segundo valor \n(Insert the second value): ");
		secondValue = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Digite um simbolo de opera��o matem�tica \n(Enter a math operation symbol): ");
		symbol = scan.next();
		
		if (symbol.equals("+")) {
			result = firstValue + secondValue;
		} else if (symbol.equals("-")) {
			result = firstValue - secondValue;
		} else if (symbol.equals("*")) {
			result = firstValue * secondValue;
		} else if (symbol.equals("/")) {
			if (secondValue != 0) {
				result = firstValue / secondValue;
			} else {
				System.out.println();
				System.out.println("Imposs�vel dividir por 0 !");
				System.out.println("Impossible to divide by 0 !");
			}
		} else {
			System.out.println();
			System.out.println("Simbolo n�o correspondente!");
			System.out.println("Symbol not matching!");
		}
		
		System.out.println();
		System.out.println((secondValue != 0) ? "Opera��o requisitada: " + firstValue + " " + symbol + " " + secondValue + " = " + result : "");
		System.out.println((secondValue != 0) ? "Required operation: " + firstValue + " " + symbol + " " + secondValue + " = " + result : "");

	}

}
