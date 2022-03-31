package practica1;
import java.util.Scanner;


/**
 * Clase que permite conocer la nota final y determinar si es suspenso o aprobado.
 * <ul>
 * <li>Pide al usuario ingresar las notas.</li>
 * <li>Comprueba que sean notas válidas.</li>
 * <li>Calcula la nota definitia.</li>
 * <li>Muestra las notas, el acumulado y la nota definitiva.</li>
 * <li>Muestra si es aprobado o suspenso.</li>
 * </ul>
 * @author AlfredoIFP
 */
public class notas {

	//Atributos
	
	/**
	 * Nota 1
	 */
	/**
	 * Nota 2
	 */
	/**
	 * Nota 3
	 */
	double nota1, nota2, nota3;
	
	/**
	 * Nota Acumulada 1
	 */
	/**
	 * Nota Acumulada 2
	 */
	/**
	 * Nota Acumulada 3
	 */
	/**
	 * Nota Definitiva
	 */
	double notaAcumulada1, notaAcumulada2, notaAcumulada3, notaDefinitiva;
	//Scanner
	Scanner entrada = new Scanner(System.in);
	

	
	/**
	 * Método que pide al usuario ingresar la nota 1, 2 y 3 para almacenarlas en las variables de clase. 
	 */
	public void IngresaNotas() {
		//Pedir notas para almacenar en las variables de clase
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		nota1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		nota2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		nota3= entrada.nextDouble();
		
	
	}
	
	
	/**
	 * Método para comprobar que la nota no séa mayor que 10
	 */
	public void comprobarcion(){
		
		if (nota1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (nota2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (nota3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	
	
	/**
	 * Método para calcular la nota final
	 */
	public void Calculonotas() {
		notaAcumulada1= nota1*0.35;
		notaAcumulada2 = nota2 * 0.35;
		notaAcumulada3 = nota3 * 0.30;
		
		notaDefinitiva = notaAcumulada1 + notaAcumulada2+ notaAcumulada3;
		
		//Guardamos la nota definitiva
	}
	
	/**
	 * Método para mostrar las notas, el acumulado y la nota definitiva
	 */
	public void Mostrar() {
		//Se imprimen los resultados
		System.out.println(" notas introducidas son:");
		System.out.println(" nota 1 = " + nota1);
		System.out.println(" nota 2 = " + nota2);
		System.out.println(" nota 3 = " + nota3);
		
		System.out.println(" acumulado 1 = "+ notaAcumulada1);
		System.out.println(" acumulado 2 = "+ notaAcumulada2);
		System.out.println(" acumulado 3 = "+ notaAcumulada3);
		
		System.out.println(" nota definitiva es = "+ notaDefinitiva);
		
	}

	/**
	 * Método para comprobar si la nota definitiva es un aprobado.
	 * Si la nota es igual o mayor que 5 y menor de 10 es aprobado.
	 * Si la nota es igual o mayor que 0 y menor que 5 es suspenso.
	 */
	public void aprobado() {
			
			if(notaDefinitiva<5 && notaDefinitiva>=0) {
				System.out.println("suspendio");
			}else {
				if (notaDefinitiva>=5 && notaDefinitiva<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
		
	 /**
	 * Método main que ejecuta el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// Creación de la clase notas
		notas fc= new notas();
		
		// Llamada a sus métodos
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}
