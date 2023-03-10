package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		/*Como executamos o contrutor com parametros, primeiro teremos que modificar a instancia do produto
		 * sento assim, teremos que primeiro armazenar em uma variavel temporaria e dps chamar ele*/
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		/*System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();*/
		
		/*utilizando o segundo construtor, onde o quantity nao é obrigatorio*/
		
		/*Agora que temos as variaveis com os valores, passamos a instancia com os dados, obrigando o user
		 * a informar um valor, sem ser null*/ 
		
		//com a sobrecarga (+1 construtor) o usuario pode escolher qual usar
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}