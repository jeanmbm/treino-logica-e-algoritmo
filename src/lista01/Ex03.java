package lista01;

import java.util.Scanner;

/* 
 * Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos brancos, nulos e v�lidos. 
 * Calcular e escrever o percentual que cada um representa em rela��o ao total de eleitores. 
 * 
 * Write an algorithm to read the total number of voters in a county, the number of white, null, and valid votes. 
 * Calculate and write down the percentage each one represents in relation to the total number of voters.
 * 
 */

public class Ex03 {
	
	static Scanner scan;
	
	public static void main(String[] args) {
		
		String county;
		int totalVoters, blankVotes, nullVotes, validVotes, percentage;
		
		scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do munic�pio");
		county = String.valueOf(scan.nextLine());
		
		System.out.println("Digite o n�mero total de eleitores do munic�pio");
		totalVoters = scan.nextInt();
		
		System.out.println("Digite o n�mero total de votos em branco");
		blankVotes = scan.nextInt();
		
		System.out.println("Digite o n�mero total de votos nulos");
		nullVotes = scan.nextInt();
		
		System.out.println("Digite o n�mero total de votos v�lidos");
		validVotes = scan.nextInt();
		
		System.out.println("============== VOTA��O ==============");
		System.out.println("Munic�pio de " + county);
		
		percentage = 
		System.out.println("Total de eleitores");
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}

}
