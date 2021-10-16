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
		
		String country;
		int totalVoters, blankVotes, nullVotes, validVotes;
		double percentage;
		
		scan = new Scanner(System.in);
		
		System.out.print("Digite o nome do munic�pio: ");
//		county = String.valueOf(scan.nextLine());
		country = "Goi�nia";
		
		System.out.print("Digite o n�mero total de eleitores do munic�pio: ");
//		totalVoters = scan.nextInt();
		totalVoters = 100;
		
		System.out.print("Digite o n�mero total de votos v�lidos: ");
//		validVotes = scan.nextInt();
		validVotes = 73;
		
		System.out.print("Digite o n�mero total de votos em branco: ");
//		blankVotes = scan.nextInt();
		blankVotes = 17;
		
		System.out.print("Digite o n�mero total de votos nulos: ");
//		nullVotes = scan.nextInt();
		nullVotes = 10;
		
		System.out.println();
		System.out.println();
		System.out.println("|============== VOTA��O ==============|");
		System.out.println("Munic�pio de " + country);
		System.out.println("Total de eleitores: " + totalVoters);
		
		percentage = validVotes / totalVoters;
		System.out.println("Porcentagem de votos v�lidos: " + percentage + "%");
		
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
