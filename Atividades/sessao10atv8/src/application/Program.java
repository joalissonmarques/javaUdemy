package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		double somaPares = 0.0;
		double mediaPares = 0.0;
		int qtdPares = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Digite um numero: \n");
			vect[i] = sc.nextInt();
			
			if(vect[i] % 2 == 0) {
				somaPares += vect[i];
				qtdPares++;
			}
		}
		
		for (int i = 0; i < vect.length; i++) {
			mediaPares = somaPares / qtdPares;
		}
		
		if(qtdPares == 0) {
			System.out.printf("\nNENHUM NUMERO PAR");
		}else {
			System.out.printf("\nMEDIA DOS PARES = %.2f%n", mediaPares);			
		}
		
		
		sc.close();

	}

}
