package entornos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Ejercicios.Operaciones;

class PruebaCadenas {

	static Operaciones o = new Operaciones();
	static int operacionesRealizadas = 0;
	
	@AfterEach
	private void pruebasrealizadas() {
		operacionesRealizadas++;
		System.out.println(" Ejecutado text " + operacionesRealizadas);
	}
	
	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se han terminado de ejecutar todas las pruebas");
		o = new Operaciones();
	}

	@DisplayName("Prueba de caja blanca")
	@Test
	void test() {
		assertEquals( "lvrrnntn" , o.cadenas("Alvaro", "Lorena", "Antonio"));
		
	}
	
	@DisplayName("Prueba de caja blanca")
	@Test
	void test1() {
		assertEquals( "drznglmzrtbz" , o.cadenas("PedroDiaz", "AngelGomez", "MartaCabeza"));
		
	}
	
	@DisplayName("Prueba de caja blanca errónea")
	@Test
	void test2() {
		assertNotEquals( "iujsdfblk" , o.cadenas("Manuel", "Jesus", "Ramona"));
		
	}
	
	@DisplayName("Prueba de caja blanca errónea")
	@Test
	void test3() {
		assertNotEquals( "srtwqd" , o.cadenas("Tuenti", "Netflix", "Instagram"));
		
	}

}
