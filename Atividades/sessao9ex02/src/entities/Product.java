package entities;

public class Product {
//Encapsulamento, o objeto nao deve expor nenhum atritubo, todos serão private
//serão acessados por meios de getters e setters.
	// Atributos
	private String name;
	private double price;
	/*O atritubo quantidade ele não pode ser alterado sem receber um valor, por questao de regra de negocio
	 * ela so pode ser alterada quando houver entrada ou saida, regra de negocio e assim ela fica consistente
	 * ela só vai mudar quando houver uma entrada ou saida e nao diretamente pelo setQuantity*/
	private int quantity;
	
	/*os metodos get e set sao utilizados caso eu queira que os atributos sejam alterados e modificados*/

	/*Caso eu queira para um atributo seja atualizado, preciso criar um metodo para isso,
	 * eles são acrescentados dps do contrutores*/
	public Product() {

	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//pegar o valor, ao inves de ser void, ele retorna o valor do atritubo
	public String getName() {
		return this.name;
	}
	
	//Aqui faço a atualização do atributo name e no set nao tem a palavra return
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}