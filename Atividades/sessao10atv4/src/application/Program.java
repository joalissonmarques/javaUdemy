package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numeros você vai digitar? ");
		
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		int qtdPares = 0;
		System.out.printf("NUMEROS PARES: \n");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				qtdPares++;
			}
		}
		
		System.out.printf("\nQUANTIDADE DE PARES  = %d", qtdPares);
		
		sc.close();

	}

}
