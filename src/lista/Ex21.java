package lista;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia 2 valores numéricos e um símbolo. Caso o símbolo seja um dos relacionados abaixo 
 * efetue a operação correspondente com os valores.
 * “+” operação de soma  |  “-” operação de subtração  |  “*” operação de multiplicação  |  “/” operação de divisão
 * 
 * Make an algorithm that reads 2 numeric values and a symbol. If the symbol is one of those listed below
 * perform a corresponding operation on the value.
 * “+” sum operation  |  “-” subtraction operation  |  “*” multiplication operation  |  “/” division operation
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
		
		System.out.print("Digite um simbolo de operação matemática \n(Enter a math operation symbol): ");
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
				System.out.println("Impossível dividir por 0 !");
				System.out.println("Impossible to divide by 0 !");
			}
		} else {
			System.out.println();
			System.out.println("Simbolo não correspondente!");
			System.out.println("Symbol not matching!");
		}
		
		System.out.println();
		System.out.println((secondValue != 0) ? "Operação requisitada: " + firstValue + " " + symbol + " " + secondValue + " = " + result : "");
		System.out.println((secondValue != 0) ? "Required operation: " + firstValue + " " + symbol + " " + secondValue + " = " + result : "");

	}

}
