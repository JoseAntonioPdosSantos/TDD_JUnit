package triangulo;

public class Triangulo {

	private int lado1, lado2, lado3;
	
	public Triangulo(int lado1, int lado2, int lado3){
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public String retornaTipo(){
		String retorno = null;
		if(isTrianguloValido()){
			retorno = "Triângulo Inválido";
		}else if(isEquilatero()){
			retorno = "Triângulo Equilátero";
		}else if (isIsosceles()){
			retorno = "Triângulo Isósceles";
		}else {
			retorno = "Triângulo Escaleno";
		}
		return retorno;
	}
	
	private boolean isEquilatero(){
		return lado1 == lado2 && lado2 == lado3;
	}
	
	private boolean isIsosceles(){
		boolean lado = false;
		if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
			lado = true;
		return lado;
	}
	
	private boolean isTrianguloValido(){
		return lado1 < 1 || lado2 < 1 || lado3 < 1;
	}
	
}
