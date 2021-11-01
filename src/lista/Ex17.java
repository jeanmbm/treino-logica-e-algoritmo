package lista;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais de 40 horas receber� hora extra, 
 * cujo c�lculo � o valor da hora regular com um acr�scimo de 50%. Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s, 
 * o sal�rio por hora e escreva o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido trabalhadas 
 * (considere que o m�s possua 4 semanas exatas).
 * 
 *  The weekly working day of an employee is 40 hours. Employees who work more than 40 hours will receive overtime, 
 *  which is calculated as the regular hourly rate plus a 50% increase. Write an algorithm that reads the number of hours worked in a month, 
 *  the hourly wage and writes the employee's total salary, which should be added to overtime if they were worked 
 *  (assume that the month has 4 exact weeks).
 * 
 */

public class Ex17 {

	public static void main(String[] args) {
		
		int hoursWorkedMouth;
		double salaryMonth, hoursWorkedWeek, totalSalary;
		boolean isExtraHour = false;
		DecimalFormat format = new DecimalFormat("#.##");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o numero de horas trabalhadas no m�s \n(Enter the number of hours worked in the month): ");
		hoursWorkedMouth = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o sal�rio ganho por hora \n(Enter the hourly wage): ");
		salaryMonth = scan.nextDouble();
		
		hoursWorkedWeek = hoursWorkedMouth / 4;
		
		if (hoursWorkedWeek > 40) {
			totalSalary = salaryMonth + (salaryMonth * 0.5);
			isExtraHour = true;
		} else {
			totalSalary = salaryMonth;
		}
		
		System.out.println();
		System.out.println((isExtraHour) ? "Voc� trabalhou mais de 40 horas semanais e receber� hora extra. Seu sal�rio final � de $" + format.format(totalSalary) : "Voc� n�o receber� hora extra. Seu sal�rio final � de $" + format.format(totalSalary));
		System.out.println((isExtraHour) ? "You have worked more than 40 hours a week and will receive overtime. Your final salary is $" + format.format(totalSalary) : "You will not receive overtime. Your final salary is $" + format.format(totalSalary));
	
	}

}
