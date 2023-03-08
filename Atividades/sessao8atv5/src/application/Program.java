package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's the dollar price? ");
		double dollar_exchange = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double dollar_value = sc.nextDouble();
		
		double result = CurrencyConverter.currencyConverter(dollar_exchange, dollar_value);	
		
		System.out.printf("Amount to be paid ion reais: %.2f%n", result);
		
		sc.close();
	}
}