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
		
		double[] vect = new double[n];
		double media = 0.0;

		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("\nDigite um numero: ");
			vect[i] = sc.nextDouble();
			media += (vect[i] / n);
		}
		
		System.out.printf("\nMEDIA DO VETOR = %.3f%n", media);
		
		System.out.printf("\nELEMENTOS ABAIXO DA MEDIA:\n");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] < media) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();
	}

}
