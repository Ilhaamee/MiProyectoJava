package tarea2;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la Calculadora");
		
		Calculadora calc = new Calculadora();
        int resultado = calc.sumar(5, 3);
        System.out.println("Resultado de la suma: " + resultado);
	}

}