package entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Ejercicios.Operaciones;

class PruebaDivisible {

	static Operaciones o = new Operaciones();
	static int operacionesRealizadas = 0;
	
	@AfterEach
	private void pruebasRealizadas() {
		operacionesRealizadas++;
		System.out.println(" Ejecutando test " + operacionesRealizadas);
	}
	
	@AfterAll
	static void TerminarPruebas() {
		System.out.println(" Se han terminado de ejecutar todas las pruebas");
		o = new Operaciones();
	}
	
	@DisplayName ("Prueba caja blanca")
	@Test
	void test1() {
		assertFalse(o.divisible(23));
	}
	
	@DisplayName ("Prueba de caja blanca erronea.") 
	@Test
	void test2() {
		assertFalse(o.divisible(6));
	}

	@DisplayName ("Prueba de caja negra, limite inferior")
	@Test
	void test3() {
		assertFalse(o.divisible(Integer.MIN_VALUE));
	}
	
	@DisplayName ("Prueba de caja negra, limite superior")
	@Test
	void test4() {
		assertFalse(o.divisible(Integer.MAX_VALUE));
	}
	
	@DisplayName ("Prueba de caja negra valor limite inferior -1")
	@Test
	void test5() {
		assertFalse(o.divisible(Integer.MIN_VALUE -1));
	}
	
	@DisplayName ("Prueba de caja negra valor limite inferior +1")
	@Test
	void test6() {
		assertFalse(o.divisible(Integer.MIN_VALUE +1));
	}
	
	@DisplayName ("Prueba de caja negra valor limite superior -1")
	@Test
	void test7() {
		assertFalse(o.divisible(Integer.MAX_VALUE -1));
	}
	
	@DisplayName ("Prueba de caja negra valor limite superior +1")
	@Test
	void test8() {
		assertFalse(o.divisible(Integer.MAX_VALUE +1));
	}
}
