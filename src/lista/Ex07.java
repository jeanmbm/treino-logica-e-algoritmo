package lista;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Fa�a um algoritmo que leia tr�s notas de um aluno, calcule e escreva a m�dia final deste aluno. 
 * Considerar que a m�dia � ponderada e que o peso das notas � 2, 3 e 5.
 * 
 * Make an algorithm that reads three grades from a student, calculates and writes that student's final grade. 
 * Consider that the average is weighted and that the weight of the grades is 2, 3 and 5.
 * 
 * */

public class Ex07 {
	
	public static void main(String[] args) {
		
		double firstNote, secondNote, thirdNote, finalAvarage;
		String name;
		DecimalFormat format = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe seu nome: \n(Enter your name): ");
		name = String.valueOf(scan.nextLine());
		
		System.out.println();
		
		System.out.print("Informe a nota da primeira avalia��o \n(Inform the grade of the first evaluation): ");
		firstNote = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Informe a nota da segunda avalia��o \n(Inform the grade of the second evaluation): ");
		secondNote = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Informe a nota da terceira avalia��o \n(Inform the grade of the third evaluation): ");
		thirdNote = scan.nextDouble();
		
		finalAvarage = ((2 * firstNote) + (3 * secondNote) + (5 * thirdNote)) / 10;
		
		System.out.println();
		System.out.println("Ol� " + name + ". Sua m�dia final � " + format.format(finalAvarage));
		System.out.println("Hello " + name + ". Your final avarage was " + format.format(finalAvarage));
		
	}

}
