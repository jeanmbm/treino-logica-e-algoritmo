package lista;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, 
 * mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. 
 * Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, 
 * o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.
 * 
 * A used car dealership pays its sales employees a fixed salary per month, 
 * plus a fixed commission for each car sold, plus 5% of the sales value they make. 
 * Write an algorithm that reads the number of cars he sold, the total value of his sales, 
 * the fixed salary, and the amount he earns per car sold. Calculate and write the salesperson's final salary.
 * 
 * */

public class Ex06 {
	
	public static void main(String[] args) {
		
		double fixedSalary, finalSalary, totalSalesAmount, commissionPerCarSold;
		int numberCarsSold;
		DecimalFormat format = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do salário fixo do vendedor \n(Enter the amount of the salesperson's fixed salary): ");
		fixedSalary = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Digite o valor total das vendas efetuadas pelo vendedor \n(Enter the total amount of sales made by the seller): ");
		totalSalesAmount = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Digite o número total de carros vendidos pelo vendedor \n(Enter the total number of cars sold by the seller): ");
		numberCarsSold = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o valor recebido por carro vendido \n(Enter the amount received per car sold): ");
		commissionPerCarSold = scan.nextDouble();
		
		finalSalary = fixedSalary + (commissionPerCarSold * numberCarsSold) + (0.05 * totalSalesAmount);
		
		System.out.println();
		System.out.println("O salário total do vendedor será de $" + format.format(finalSalary));
		System.out.println("The seller's total salary will be $" + format.format(finalSalary));

	}

}
