package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		People[] vect = new People[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %da pessoa: ", i + 1);
			sc.nextLine();
			System.out.printf("\nNome: ");
			String name = sc.nextLine();
			System.out.printf("Idade: ");
			int age = sc.nextInt();
			
			vect[i] = new People(name, age);
		}
		
		int idadeMaior = vect[0].getAge();
		int posicaoMaiorIdade = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() > idadeMaior) {
				idadeMaior = vect[i].getAge();
				posicaoMaiorIdade = i;
			}
		}
		
		System.out.printf("\nPESSOA MAIS VELHA: %s", vect[posicaoMaiorIdade].getName());
		
		sc.close();

	}

}
