package lista01;

import java.util.Scanner;

/*
 * Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano 
 * (não é necessário considerar o mês em que a pessoa nasceu).
 * 
 * Read a person's current year and year of birth. Write a message that says whether or not she can vote this year 
 * (it is not necessary to consider the month the person was born).
 * 
 */

public class Ex13 {

	public static void main(String[] args) {
		
		int currentYear = 0, birthYear = 0, age = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu ano de nascimento \n(Enter your year of birth): ");
		birthYear = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o ano atual \n(Enter the current year): ");
		currentYear = scan.nextInt();
		
		age = currentYear - birthYear;
		
		System.out.println();
		System.out.println((age < 16) ? "Você ainda não pode votar" : "Você já está na idade de poder votar!!");
		System.out.println((age < 16) ? "You still can't vote" : "You are now of voting age!!");
		
	}

}
