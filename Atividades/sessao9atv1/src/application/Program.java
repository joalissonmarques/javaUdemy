package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Declaramos aqui para ter acesso em todo o codigo.
		Account account;
		
		System.out.print("Enter Account Number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter Account Holder: ");
		//Pegar o valor da linha
		sc.nextLine();
		String name = sc.next();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		//pegar a primeira letra
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			account = new Account(number, name, initialDeposit);
		}else {
			account = new Account(number, name);
		}
		
		System.out.println();
		System.out.print("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a WithDraw value: ");
		double withDraw = sc.nextDouble();
		account.withDraw(withDraw);
		System.out.println("Updated data:");
		System.out.println(account);
		
		
		sc.close();
	}

}
