package lista01;

import java.text.DecimalFormat;
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
	
	public static void main(String[] args) {
		
		String country;
		double totalVoters, blankVotes, nullVotes, validVotes;
		double percentage;
		DecimalFormat format = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Digite o nome do município \n(Enter the name of the municipality): ");
		country = String.valueOf(scan.nextLine());
		
		System.out.println();
		
		System.out.print("Digite o número total de eleitores do município \n(Enter the total number of voters in the municipality): ");
		totalVoters = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o número total de votos válidos \n(Enter the total number of valid votes): ");
		validVotes = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o número total de votos em branco \n(Enter the total number of blank votes): ");
		blankVotes = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o número total de votos nulos \n(Enter the total number of null votes): ");
		nullVotes = scan.nextInt();
		
		System.out.println();
		System.out.println();
		System.out.println("================== VOTAÇÃO ==================");
		System.out.println("Município de " + country);
		System.out.println("Total de eleitores: " + totalVoters);
		
		percentage = 100 * (validVotes / totalVoters);
		System.out.println("Porcentagem de votos válidos: " + format.format(percentage) + "%");
		
		percentage = 100 * (blankVotes / totalVoters);
		System.out.println("Porcentagem de votos em branco: " + format.format(percentage) + "%");
		
		percentage = 100 * (nullVotes / totalVoters);
		System.out.println("Porcentagem de votos nulos: " + format.format(percentage) + "%");

	}

}
