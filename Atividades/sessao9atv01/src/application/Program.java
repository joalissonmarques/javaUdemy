package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Foi iniciado aqui fora para termos acesso a class/entities em todo o codigo*/
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		/*Colocamos um nextLine antes para ela consumir a quebra de linha pendente e assim pegar o valor
		 * da variavel*/
		sc.nextLine();
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)?");
		char reponse = sc.next().charAt(0);
		
		if(reponse == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			account = new Account(accountNumber, accountHolder, initialDeposit);
		}else{
			account = new Account(accountNumber, accountHolder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		//Print normal para ele não pular a linha
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withDraw value: ");
		double withDraw = sc.nextDouble();
		account.withDraw(withDraw);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
