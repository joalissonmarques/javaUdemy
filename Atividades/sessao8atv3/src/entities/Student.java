package entities;

public class Student {
	
	//Atributos
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		return this.nota1 + this.nota2 + this.nota3;
	}
	
	public double missingPoints() {
		if(finalGrade() < 60.0) {
			return finalGrade() - 60.0;
		}else {
			return 0.0;
		}
	}
}
