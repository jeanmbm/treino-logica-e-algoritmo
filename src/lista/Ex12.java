package lista;

import java.util.Scanner;

/*
 * Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem 
 * que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado).
 * Escrever também a média calculada.
 * 
 * Read the notes for the 1st. and 2nd. assessments of a student. Calculate the simple arithmetic average and write a message 
 * that says whether the student was approved or not (consider that a grade equal to or greater than 6 the student passes). 
 * Also write the calculated average.
 * 
 */

public class Ex12 {
	
	public static void main(String[] args) {
		
		double firstNote, secondNote, avarage;
		String name;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe seu nome: \n(Enter your name): ");
		name = String.valueOf(scan.nextLine());
		
		System.out.println();
		
		System.out.print("Informe a nota da primeira avaliação \n(Inform the grade of the first evaluation): ");
		firstNote = scan.nextDouble();
		
		System.out.println();
		
		System.out.print("Informe a nota da segunda avaliação \n(Inform the grade of the second evaluation): ");
		secondNote = scan.nextDouble();
		
		avarage = (firstNote + secondNote) / 2;
		
		System.out.println();
		System.out.println();
		System.out.println("Olá " + name + ".");
		System.out.println((avarage < 6) ? "Você foi reprovado. Esforçe-se mais na próxima!" : "Você foi aprovado. Parabéns!!");
		System.out.println("Sua média foi " + avarage);
		
		System.out.println();
		System.out.println("Hello " + name + ".");
		System.out.println((avarage < 6) ? "You failed. Try harder next time!" : "You were approved. Congratulations!!");
		System.out.println("Your average was " + avarage);
		
	}

}
