package lista;

import java.text.DecimalFormat;
import java.util.Scanner;

/* 
 * Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste. 
 * Calcular e escrever o valor do novo sal�rio. 
 * 
 * Write an algorithm to read an employee's current monthly salary and adjustment percentage. 
 * Calculate and write the new salary amount.
 * 
 */

public class Ex04 {
	
	public static void main(String[] args) {

		double currentWage, readjustmentPercentage, newWage; 
		Scanner scan = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.##");
		
		System.out.print("Digite seu sal�rio mensal atual \n(Enter your current monthly salary): ");
		currentWage = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Digite o valor do percentual de reajuste, em porcentagem \n(Enter the readjustment percentage value, in percentage): ");
		readjustmentPercentage = scan.nextDouble();
		
		newWage = currentWage + (currentWage * (readjustmentPercentage / 100));
		
		System.out.println();
		System.out.println("Seu novo sal�rio ser� de $" + newWage);
		System.out.println("Your new salary will be $" + newWage);

	}

}
