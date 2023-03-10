package entities;

public class Product {
	
	//atributos
	public String name;
	public double price;
	public int quantity;
	
	//posso colocar o construtor padrao (sobrecarga) onde o usuario pode escolher o construtor
	
	public Product() {
		
	}
	
	//Construtor ele executa no momento da inicialização do objeto e obriga o user a colocar dados e para isso meu construtor tem que receber esses dados como parametros
	//Posso utilizar outros nomes no construtor, por conversao usamos o mesmo nome.
	//o this.name é o atributo lá acima e o nome é do construtor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Exemplo de sobrecagar, criando mais de um construtor
	//Vale lembrar que o java inicia numeros com 0 e string com null caso eu não passe o parametro
	/*Sobrecarga eu posso disponibilizar mais de uma versao de opcao para o usuario a diferença é a quantidade
	 * de parametros que eu informo que o usuario pode colocar*/
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		//como eu não tenho o parametro quantity, não preciso colocar o this, ele ja reconhece o atributo
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