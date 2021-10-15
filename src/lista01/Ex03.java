package lista01;

import java.util.Scanner;

/* 
 * Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. 
 * Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. 
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
		
		System.out.println("Digite o nome do município");
		county = String.valueOf(scan.nextLine());
		
		System.out.println("Digite o número total de eleitores do município");
		totalVoters = scan.nextInt();
		
		System.out.println("Digite o número total de votos em branco");
		blankVotes = scan.nextInt();
		
		System.out.println("Digite o número total de votos nulos");
		nullVotes = scan.nextInt();
		
		System.out.println("Digite o número total de votos válidos");
		validVotes = scan.nextInt();
		
		System.out.println("============== VOTAÇÃO ==============");
		System.out.println("Município de " + county);
		
		percentage = 
		System.out.println("Total de eleitores");
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}

}
