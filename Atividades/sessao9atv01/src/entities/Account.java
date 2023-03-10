package entities;

public class Account {
	
	//Atributos
	private int numberAccount;
	private String nameHolder;
	private double balance;
	
	//Constructor 2 arguments
	public Account(int number, String name){
		this.numberAccount = number;
		this.nameHolder = name;
	}
	
	//Constructor Sobrecarga 3 arguments
	public Account(int number, String name, double initialDeposit){
		this.numberAccount = number;
		this.nameHolder = name;
		/*Passams a funcao, pois estamos efetuando um primeiro deposito, conforme a questao pede, assim caso
		 * aconteça da funcao deposito mudar algo, só vamos precisar alterar na função, encapsulamento*/
		deposit(initialDeposit);
	}
	
	//Metodos get e set
	public int getNumberAccount(){
		return this.numberAccount;
	}
	
	public String getNameHolder(){
		return this.nameHolder;
	}
	
	public void setNameHolder(String name){
		this.nameHolder = name;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	//Functions
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withDraw(double amount) {
		double rate = 5.00;
		
		this.balance -= amount + rate;
	}
	
	public String toString() {
		return "Account "
				+ numberAccount
				+ ", Holder: "
				+ nameHolder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
