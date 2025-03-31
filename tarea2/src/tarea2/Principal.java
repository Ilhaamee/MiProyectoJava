package tarea2;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la Calculadora");
		
		Calculadora calc = new Calculadora();
		
        int resultado = calc.sumar(5, 3);
        System.out.println("Resultado de la suma: " + resultado);
        
        int resultadoMultip = calc.multiplicar(3, 4);
        System.out.println("Resultado de la multiplicación: " + resultadoMultip);
        
        try {
            double resultadoDivision = calc.dividir(10, 0);
            System.out.println("Resultado de la división: " + resultadoDivision);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        int resultadoPotencia = calc.potencia(2, 3);
        System.out.println("Resultado de la potencia 2^3: " + resultadoPotencia);
        
        System.out.println("Gracias por usar la Calculadora.");
	}

}