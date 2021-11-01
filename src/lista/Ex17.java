package lista;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, 
 * cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
 * o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
 * (considere que o mês possua 4 semanas exatas).
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
		
		System.out.print("Digite o numero de horas trabalhadas no mês \n(Enter the number of hours worked in the month): ");
		hoursWorkedMouth = scan.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o salário ganho por hora \n(Enter the hourly wage): ");
		salaryMonth = scan.nextDouble();
		
		hoursWorkedWeek = hoursWorkedMouth / 4;
		
		if (hoursWorkedWeek > 40) {
			totalSalary = salaryMonth + (salaryMonth * 0.5);
			isExtraHour = true;
		} else {
			totalSalary = salaryMonth;
		}
		
		System.out.println();
		System.out.println((isExtraHour) ? "Você trabalhou mais de 40 horas semanais e receberá hora extra. Seu salário final é de $" + format.format(totalSalary) : "Você não receberá hora extra. Seu salário final é de $" + format.format(totalSalary));
		System.out.println((isExtraHour) ? "You have worked more than 40 hours a week and will receive overtime. Your final salary is $" + format.format(totalSalary) : "You will not receive overtime. Your final salary is $" + format.format(totalSalary));
	
	}

}
