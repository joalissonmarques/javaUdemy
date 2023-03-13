package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		People[] vect = new People[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("\nAltura da %d° pessoa? ", i + 1);
			sc.nextLine();
			double altura = sc.nextDouble();
			System.out.printf("\nGenero da %d° pessoa F ou M? ", i + 1);
			char genero = sc.next().charAt(0);
			
			vect[i] = new People(altura, genero);
		}
		
		double menorAltura = vect[0].getAltura();
		double maiorAltura = vect[0].getAltura();

		
		for (int i = 0; i < vect.length; i++) {
			
			if(vect[i].getAltura() > maiorAltura) {
				maiorAltura = vect[i].getAltura();
			}
			
			if (vect[i].getAltura() < menorAltura) {
				menorAltura = vect[i].getAltura();
			}
		}
		
		double mediaAlturaMulheres = 0.0;
		int qtdHomens = 0;
		int qtdMulheres = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getGenero() == 'F') {
				qtdMulheres++;
				mediaAlturaMulheres += vect[i].getAltura();
			}else {
				qtdHomens++;
			}
		}
		
		mediaAlturaMulheres = (mediaAlturaMulheres / qtdMulheres);
		
		System.out.printf("\nMenor altura %.2f ", menorAltura);
		System.out.printf("\nMaior altura %.2f ", maiorAltura);
		System.out.printf("\nMedia das alturas das mulheres = %.2f", mediaAlturaMulheres);
		System.out.printf("\nNumero de homens = %d", qtdHomens);
		
		sc.close();
	}

}
