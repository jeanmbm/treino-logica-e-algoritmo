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
		
		String country;
		int totalVoters, blankVotes, nullVotes, validVotes;
		double percentage;
		
		scan = new Scanner(System.in);
		
		System.out.print("Digite o nome do município: ");
//		county = String.valueOf(scan.nextLine());
		country = "Goiânia";
		
		System.out.print("Digite o número total de eleitores do município: ");
//		totalVoters = scan.nextInt();
		totalVoters = 100;
		
		System.out.print("Digite o número total de votos válidos: ");
//		validVotes = scan.nextInt();
		validVotes = 73;
		
		System.out.print("Digite o número total de votos em branco: ");
//		blankVotes = scan.nextInt();
		blankVotes = 17;
		
		System.out.print("Digite o número total de votos nulos: ");
//		nullVotes = scan.nextInt();
		nullVotes = 10;
		
		System.out.println();
		System.out.println();
		System.out.println("|============== VOTAÇÃO ==============|");
		System.out.println("Município de " + country);
		System.out.println("Total de eleitores: " + totalVoters);
		
		percentage = validVotes / totalVoters;
		System.out.println("Porcentagem de votos válidos: " + percentage + "%");
		
		percentage = blankVotes / totalVoters;
		System.out.println("Porcentagem de votos em branco: " + percentage + "%");
		
		percentage = nullVotes / totalVoters;
		System.out.println("Porcentagem de votos nulos: " + percentage + "%");

	}
	
	public static boolean validateValue(int value) {
		boolean valid = false;
		
		if (value >= 0) {
			valid = true;
		}
		
		return valid;
	}

}
