package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//Vetor de produtos com n elementos
		Product[] vect = new Product[n];
		
		//POSSO TROCAR ESSE N POR VECT.LENGTH
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			//Aqui o vetor vai apontar para o produto - sessao 10 vetor 2 6:00
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < n; i++) {
			//pegando dentro do vetor somente o price
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();

	}

}
