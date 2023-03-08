package application;

import java.util.Scanner;

import entities.Student;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Informe seu nome: ");
		student.name = sc.nextLine();
		System.out.println("Informe sua 1 Nota: ");
		student.nota1 = sc.nextDouble();
		if(student.nota1 > 30) {
			System.out.println("Primeiro trimestre vale ate 30");
			System.exit(0);
		}
		System.out.println("Informe sua 2 Nota: ");
		student.nota2 = sc.nextDouble();
		System.out.println("Informe sua 3 Nota: ");
		student.nota3 = sc.nextDouble();
		if(student.nota2 > 35 || student.nota3 > 35) {
			System.out.println("segundo e terceiro trimestre valem apenas 35 cada");
			System.exit(0);
		}
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
			}
			else {
			System.out.println("PASS");
			}
		sc.close();
	}
}
