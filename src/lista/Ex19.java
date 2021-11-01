package lista;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual 
 * (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', 
 * senão escrever a mensagem 'Saldo Negativo'.
 * 
 * Make an algorithm to read: customer account number, balance, debit and credit. Afterwards, calculate and write the current balance 
 * (current balance = balance - debit + credit). Also test if current balance is greater than or equal to zero write the message 
 * 'Positive Balance', otherwise write the message 'Negative Balance'.
 * 
 */

public class Ex19 {

	public static void main(String[] args) {
		
		int accountNumber;
		double balance, debt, credit, currentBalance;;
		Scanner scan = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.##");
		
		System.out.print("Digite o número da conta \n(Enter account number): ");
		accountNumber = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o saldo da conta \n(Enter balance account): ");
		balance = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Digite o débito da conta \n(Enter debt account): ");
		debt = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Digite o credito da conta \n(Enter credit account): ");
		credit = scan.nextDouble();
		
		currentBalance = balance - debt + credit;
		
		System.out.println();
		System.out.println("Número da conta: " + accountNumber);
		System.out.println((currentBalance >= 0) ? "Saldo Positivo" : "Saldo Negativo");
		System.out.println((currentBalance >= 0) ? "Positive Balance" : "Negative Balance");
		
	}

}
