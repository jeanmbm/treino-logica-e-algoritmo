package lista;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do distribuidor e dos impostos 
 * (aplicados ao custo de f�brica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
 * escrever um algoritmo para ler o custo de f�brica de um carro, calcular e escrever o custo final ao consumidor.
 * 
 * 
 * The cost of a new car to the consumer is the sum of the factory cost plus the distributor's percentage and taxes 
 * (applied to the factory cost). Assuming the distributor percentage is 28% and taxes 45%, 
 * write an algorithm to read the factory cost of a car, calculate and write the final cost to the customer.
 * 
 */

public class Ex05 {

	public static void main(String[] args) {

		double distributorPercentage = 0.28, tax = 0.45, factoryCost, finalCost;
		DecimalFormat format = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		

		System.out.print("Digite o custo de f�brica do autom�vel \n(Enter the factory cost of the car): ");
		factoryCost = scan.nextDouble();
		
		finalCost = factoryCost + (factoryCost * distributorPercentage) + (factoryCost * tax);
		
		System.out.println();
		System.out.println("O custo final do autom�vel ser� de $" + format.format(finalCost));
		System.out.println("The final cost of the car will be $" + format.format(finalCost));
		
	}

}
