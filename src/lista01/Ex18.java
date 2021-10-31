package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% 
 * sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.
 * 
 * Read the fixed salary and the value of sales made by the salesperson of a company. Knowing that he receives a commission of 3% 
 * on total sales up to R$1,500.00 plus 5% on what exceeds this amount, calculate and write his total salary.
 * 
 */

public class Ex18 {

	public static void main(String[] args) {
		
		double fixedSalary, salesMadeValue, totalSalary;
		DecimalFormat format = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do salário fixo do vendedor \n(Enter the amount of the salesperson's fixed salary): ");
		fixedSalary = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Digite o valor das vendas efetuadas pelo vendedor \n(Enter the amount of sales made by the seller): ");
		salesMadeValue = scan.nextDouble();
		
		if (salesMadeValue <= 1500) {
			totalSalary = fixedSalary + (salesMadeValue * 0.03);
		} else {
			totalSalary = fixedSalary + (1500 * 0.03) + ((salesMadeValue - 1500) * 0.05);
		}
		
		System.out.println();
		System.out.println("O salário total do vendedor será de $" + format.format(totalSalary));
		System.out.println("The seller's total salary will be $" + format.format(totalSalary));
		
	}

}
