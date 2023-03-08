package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas serao digitas? ");
		int n = sc.nextInt();
		
		
		People[] vect = new People[n];
		
		for (int i = 0; i < vect.length; i++) {
			
			int count = i + 1;
			System.out.printf("Dados da "+ count +"a pessoa:\n");
			count++;
			
			sc.nextLine();
			System.out.printf("Nome: ");
			String name = sc.nextLine();
			System.out.printf("Idade: ");
			int age = sc.nextInt();
			System.out.printf("Height: ");
			double height = sc.nextDouble();
			
			vect[i] = new People(name, age, height);
		}
		
		double avg = 0.0;
		int menor = 0;
		for (int i = 0; i < vect.length; i++) {
			avg += vect[i].getHeight() / vect.length;
			if(vect[i].getAge() < 16) {
				menor++;
			}
		}
		
		double percentualMenor = (((double)menor/vect.length) * 100.0);
		
		System.out.printf("Altura média: %.2f\n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", percentualMenor);
		
	
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() < 16) {
				System.out.printf("%s\n",vect[i].getName());
			}
		}
			
		
		sc.close();

	}

}
