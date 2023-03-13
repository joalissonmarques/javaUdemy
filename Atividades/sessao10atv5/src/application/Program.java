package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numeros você vai digitar? \n");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double maiorValor = vect[0];
		int posicaoMaior = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] > maiorValor) {
				maiorValor = vect[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf("MAIOR VALOR %.1f\n", maiorValor);
		System.out.printf("POSICAO VALOR = %d\n", posicaoMaior);
		
		sc.close();

	}

}
