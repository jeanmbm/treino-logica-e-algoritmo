package lista;

import java.util.Scanner;

/*
 * 	Crie um algoritmo que leia a idade de uma pessoa e informe a sua classe eleitoral:
 * 		não eleitor (abaixo de 16 anos)
 * 		eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
 * 		eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive).
 *
 * 	Create an algorithm that reads a person's age and informs their constituency:
 * 		non-voter (under 16 years)
 * 		mandatory voter (between 18 and under 65);
 * 		optional voter (from 16 to 18 years old and over 65 years old, inclusive).
 * 
 */

public class Ex24 {

	public static void main(String[] args) {

		int age;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua idade: \n(Insert your age): ");
		age = scan.nextInt();
		
		System.out.println();
		
		if (age < 16) {
			System.out.println("Classe eleitoral: não eleitor");
			System.out.println("Electoral class: non-voter");
		} else if (age >= 16 && age < 18 || age >= 65) {
			System.out.println("Classe eleitoral: eleitor facultativo");
			System.out.println("Electoral class: optional voter");
		} else {
			System.out.println("Classe eleitoral: eleitor obrigatório");
			System.out.println("Electoral class: mandatory voter");
		}

	}

}
