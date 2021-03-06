package lista;

import java.util.Scanner;

/*
 * Ler a hora de in?cio e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) 
 * e calcule a dura??o do jogo em horas, sabendo-se que o tempo m?ximo de dura??o do jogo ? de 24 horas e que o jogo 
 * pode iniciar em um dia e terminar no dia seguinte.
 * 
 * Read the start time and end time of a chess game (consider only whole hours, without minutes) 
 * and calculate the game duration in hours, knowing that the maximum duration of the game is 24 hours and that the game 
 * can start in one day and end the next day.
 * 
 */

public class Ex16 {

	public static void main(String[] args) {
		
		int startTime, endTime, duration;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a hora de in?cio da partida \n(Enter the start time of the match): ");
		startTime = scan.nextInt();	
		
		System.out.println();
		
		System.out.print("Digite a hora do fim da partida \n(Enter the match end time): ");
		endTime = scan.nextInt();
		
		if (startTime < endTime) {
			duration = endTime - startTime;
		} else {
			duration = (24 - startTime) + endTime;
		}
		
		System.out.println();
		System.out.println("A partida durou " + duration + " hora(s)");
		System.out.println("The match lasted " + duration + " hour(s)");
		
	}

}
