package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		
		System.out.printf("Digite os valores do vetor A");
		System.out.printf("\n");
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.printf("Digite os valores do vetor B");
		System.out.printf("\n");
		for (int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.printf("VETOR RESULTANTE:");
		System.out.printf("\n");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%d%n", vectA[i] + vectB[i]);
		}
			
		sc.close();

	}

}
