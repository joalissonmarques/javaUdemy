package application;

import java.util.Scanner;

import util.Calculator;

public class Program {
//first version
	//Vale lembrar que atributos staticos final são em maiusculos e não são alterados
	/*public static final double PI = 3.14159;*/
	//Metodos staticas só aceitam metodos staticas, se apagar o static da funcao lá em baixo, o compilador reclama
	public static void main(String[] args) {
		/*Calculator cal = new Calculator()*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value radius: ");
		double radius = sc.nextDouble();
		//caso meu metodo Calculator seja static, eu não preciso instanciar ele conforme mostrado acima.
		double circu = Calculator.circumference(radius);
		
		double vol = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circu);
		System.out.printf("Volume: %.2f%n", vol);
		System.out.printf("Value PI: %.2f%n", Calculator.PI);
		
		sc.close();
	}
	
	/*public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}*/
}
