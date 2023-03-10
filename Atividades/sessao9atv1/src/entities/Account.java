package entities;

public class Account {

	//Atributos
	private int number;
	private String holder;
	private double balance;
	
	//Constructor
	public Account(int number, String name) {
		this.number = number;
		this.holder = name;
		
	}
	//Constructor
	public Account(int number, String name, double initialValue) {
		this.number = number;
		this.holder = name;
		/*Ele recebe o valor no deposito, pois ao iniciar o programa ele pergunta se quer fazer o deposito primeiro
		e caso alguam regra mude, não iremos precisar mudar no constructor*/
		deposit(initialValue);
	}
	
	//Functions Getters and Setters 
	public int getNumber() {
		return this.number;
	}
	
	public String getHolder() {
		return this.holder;
	}
	
	public void setHolder(String name) {
		this.holder = name;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	//Functions Deposit and WithDraw
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withDraw(double amount) {
		double rate = 5.00;
		this.balance -= amount + rate;
	}
	
	public String toString() {
		return "Account: "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
