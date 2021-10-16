package lista01;

import java.util.Scanner;

/*
 *  Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!
 * 
 * Reading a value and writing the message 'IS GREATER THAN 10!' if the value read is greater than 10, otherwise write 'NOT GREATER THAN 10!'
 * 
 */

public class Ex09 {
	
	public static void main(String[] args) {
		
		double value;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o vlaor \n(Enter the value): ");
		value = scan.nextDouble();
		
		System.out.println();
		System.out.println((value > 10) ? "É MAIOR QUE 10!" : "NÃO É MAIOR QUE 10!");
		
	}

}
