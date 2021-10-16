package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius
 * 
 * Write an algorithm to read a temperature in degrees Fahrenheit, calculate and write the corresponding value in degrees Celsius.
 * 
 */

public class Ex08 {

	public static void main(String[] args) {
		
		double celsius, fahrenheit;
		Scanner scan = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.##");
		
		System.out.print("Digite o valor Fahrenheit \n(Enter the value in fahrenheit): ");
		fahrenheit = scan.nextDouble();
		
		celsius = (fahrenheit - 32) / 1.8;
		
		System.out.println();
		System.out.println("A temperatura de " + format.format(fahrenheit) + "°F em celsius é " + format.format(celsius) + "°C");
		System.out.println("The temperature of  " + format.format(fahrenheit) + "°F in celsius is " + format.format(celsius) + "°C");
		
	}
	
}
