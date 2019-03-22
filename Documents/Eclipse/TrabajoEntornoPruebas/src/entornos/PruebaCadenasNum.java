package entornos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Ejercicios.Operaciones;

class PruebaCadenasNum {

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
		assertEquals(45, o.cadenaDeNumeros("Alvaro Manso Rojas 09/09/1998"));
		
	}

	@DisplayName("Prueba de caja blanca")
	@Test
	void test1() {
		assertEquals(36, o.cadenaDeNumeros("Lorena Martinez 17/10/1998"));
		
	}
	
	@DisplayName("Prueba de caja blanca")
	@Test
	void test2() {
		assertEquals(35, o.cadenaDeNumeros("Antonio Jesus Rojas 28/12/1993"));
		
	}
	
	@DisplayName("Prueba de caja blanca errónea")
	@Test
	void test3() {
		assertNotEquals("32", o.cadenaDeNumeros("Alvaro Manso Rojas 09/09/1998"));
		
	}
	
	@DisplayName("Prueba de caja blanca errónea")
	@Test
	void test4() {
		assertNotEquals(399, o.cadenaDeNumeros("Lorena Martinez 17/10/1998"));
		
	}
	
	@DisplayName("Prueba de caja blanca errónea")
	@Test
	void test5() {
		assertNotEquals("qweqwe", o.cadenaDeNumeros("Antonio Jesus Rojas 28/12/1993"));
		
	}

}
