package tarea2;

/**
 * Clase principal que ejecuta la calculadora.
 */

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la Calculadora");
		
		// Creación de la instancia de Calculadora
		Calculadora calc = new Calculadora();
		
		// Operaciones básicas
        int resultado = calc.sumar(5, 3);
        System.out.println("Resultado de la suma: " + resultado);
        
        int resultadoMultip = calc.multiplicar(3, 4);
        System.out.println("Resultado de la multiplicación: " + resultadoMultip);
        
        // Manejo de excepción en división
        try {
            double resultadoDivision = calc.dividir(10, 0);
            System.out.println("Resultado de la división: " + resultadoDivision);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Nueva funcionalidad: potencia
        int resultadoPotencia = calc.potencia(2, 3);
        System.out.println("Resultado de la potencia 2^3: " + resultadoPotencia);
        
        System.out.println("Gracias por usar la Calculadora.");
        
       // Nueva funcionalidad agregada en este commit
        try {
            double resultadoRaiz = calc.raizCuadrada(16);
            System.out.println("Raíz cuadrada de 16: " + resultadoRaiz);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}