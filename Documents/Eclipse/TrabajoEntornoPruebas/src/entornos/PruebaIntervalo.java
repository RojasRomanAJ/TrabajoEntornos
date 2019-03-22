package entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Ejercicios.Operaciones;

class PruebaIntervalo {

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

	
	@DisplayName ("Prueba de caja blanca")
	@Test
	void test() {
		assertTrue(o.intervalo(651));
	}
	
	@DisplayName ("Prueba de caja blanca errónea")
	@Test
	void test1() {
		assertFalse(o.intervalo(649));
	}
	
	@DisplayName ("Prueba de caja blanca errónea 2")
	@Test
	void test2() {
		assertFalse(o.intervalo(751));
	}
	
	@DisplayName ("Prueba de caja negra, límite inferior")
	@Test
	void test3() {
		assertFalse(o.intervalo(Integer.MIN_VALUE));
		
	}
	
	@DisplayName ("Prueba de caja negra, límite superior")
	@Test
	void test4() {
		assertFalse(o.intervalo(Integer.MAX_VALUE));
		
	}
	
	@DisplayName ("Test de caja negra valor límite inferior -1")
	@Test
	void test5() {
		assertFalse(o.intervalo(Integer.MIN_VALUE -1));
	}
	
	@DisplayName ("Test de caja negra valor límite inferior +1")
	@Test
	void test6() {
		assertFalse(o.intervalo(Integer.MIN_VALUE +1));
	}
	
	@DisplayName ("Test de caja negra valor límite superior -1")
	@Test
	void test7() {
		assertFalse(o.intervalo(Integer.MAX_VALUE -1));
	}
	
	@DisplayName ("Test de caja negra valor límite superior +1")
	@Test
	void test8() {
		assertFalse(o.intervalo(Integer.MAX_VALUE +1));
	}

}
