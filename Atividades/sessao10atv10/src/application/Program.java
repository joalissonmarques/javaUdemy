package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		int qtdNotas = 2;
		
		Student[] vect = new Student[n];
		double nota1 = 0.0;
		double nota2 = 0.0;
		double mediaNota = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("\nDigite nome do %d° aluno: ", i + 1);
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("\nDigite as notas do %d° aluno: ", i + 1);
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			
			vect[i] = new Student(name, nota1, nota2);
		}
		
		System.out.printf("Alunos aprovados: ");
		for (int i = 0; i < vect.length; i++) {
			mediaNota = (vect[i].getNota1() + vect[i].getNota2()) / qtdNotas;
			
			if(mediaNota >= 6.0) {
				System.out.printf("%s\n", vect[i].getName());
			}
		}

		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
