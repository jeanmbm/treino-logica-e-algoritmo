package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12. 
 * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.
 * 
 * Apples cost R$1.30 each if less than a dozen are purchased, and R$1.00 if at least 12 are purchased. 
 * Write a program that reads the number of apples purchased, calculates and writes the total cost of the purchase.
 * 
 */

public class Ex11 {
	
	public static void main(String[] args) {
		
		double applePrice = 1.3, appleDozenPrice = 1;
		int  applePurchsed;
		DecimalFormat format = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de maçãs compradas \n(Enter the amount of apples purchased): ");
		applePurchsed = scan.nextInt();
		
		System.out.println();
		System.out.println();
		System.out.println("Foi/foram compra(s) " + applePurchsed +  " maçã(s)");
		System.out.println((applePurchsed < 12) ? "O valor a ser pago será de $" + format.format(applePurchsed * applePrice) : "O valor a ser pago será de R$" + format.format(applePurchsed * appleDozenPrice));
		
		System.out.println();
		System.out.println("Was/were purchased " + applePurchsed +  " apple(s)");
		System.out.println((applePurchsed < 12) ? "The amount to be paid will be $" + format.format(applePurchsed * applePrice) : "The amount to be paid will be R$" + format.format(applePurchsed * appleDozenPrice));
		
	}

}
