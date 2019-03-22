package entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Ejercicios.Operaciones;

class PruebaDividir {

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
		assertEquals(0,o.dividir(600,620));
	}
	
	@DisplayName ("Prueba de caja blanca")
	@Test
	void test1() {
		assertEquals(0,o.dividir(652,743));
	}
	
	@DisplayName ("Prueba de caja blanca, erronea")
	@Test
	void test2() {
		assertNotEquals(1,o.dividir(650,750));
		
	}
	
	@DisplayName ("Prueba de caja blanca, erronea")
	@Test
	void test3() {
		assertNotEquals(1,o.dividir(650,700));
		
	}
	
	@DisplayName ("Prueba de caja blanca")
	@Test
	void test4() {
		assertEquals(0,o.dividir(600,760));
	}
	
	@DisplayName ("Test de caja negra valor límite inferior/límite inferior")
	@Test
	void test5() {
		assertEquals(0,o.dividir(Integer.MIN_VALUE,Integer.MIN_VALUE));
	}
	
	@DisplayName ("Test de caja negra valor límite inferior -1/límite inferior")
	@Test
	void test6() {
		assertEquals(0,o.dividir(Integer.MIN_VALUE-1,Integer.MIN_VALUE));
	}
	
	@DisplayName ("Test de caja negra valor límite inferior/límite inferior-1")
	@Test
	void test7() {
		assertEquals(0,o.dividir(Integer.MIN_VALUE,Integer.MIN_VALUE-1));
	}
	
	@DisplayName ("Test de caja negra valor límite inferior-1/límite inferior-1")
	@Test
	void test8() {
		assertEquals(0,o.dividir(Integer.MIN_VALUE-1,Integer.MIN_VALUE-1));
	}
	
	@DisplayName ("Test de caja negra valor límite inferior+1/límite inferior")
	@Test
	void test9() {
		assertEquals(0,o.dividir(Integer.MIN_VALUE+1,Integer.MIN_VALUE));
	}
	
	@DisplayName ("Test de caja negra valor límite inferior/límite inferior+1")
	@Test
	void test10() {
		assertEquals(0,o.dividir(Integer.MIN_VALUE,Integer.MIN_VALUE+1));
	}
	
	@DisplayName ("Test de caja negra valor límite inferior+1/límite inferior+1")
	@Test
	void test11() {
		assertEquals(0,o.dividir(Integer.MIN_VALUE+1,Integer.MIN_VALUE+1));
	}
	
	@DisplayName ("Test de caja negra valor límite superior/límite superior")
	@Test
	void test12() {
		assertEquals(0,o.dividir(Integer.MAX_VALUE,Integer.MAX_VALUE));
	}
	
	@DisplayName ("Test de caja negra valor límite superior -1/límite superior")
	@Test
	void test13() {
		assertEquals(0,o.dividir(Integer.MAX_VALUE-1,Integer.MAX_VALUE));
	}
	
	@DisplayName ("Test de caja negra valor límite superior/límite superior-1")
	@Test
	void test14() {
		assertEquals(0,o.dividir(Integer.MAX_VALUE,Integer.MAX_VALUE-1));
	}
	
	@DisplayName ("Test de caja negra valor límite superior-1/límite superior-1")
	@Test
	void test15() {
		assertEquals(0,o.dividir(Integer.MAX_VALUE-1,Integer.MAX_VALUE-1));
	}
	
	@DisplayName ("Test de caja negra valor límite superior+1/límite superior")
	@Test
	void test16() {
		assertEquals(0,o.dividir(Integer.MAX_VALUE+1,Integer.MAX_VALUE));
	}
	
	@DisplayName ("Test de caja negra valor límite superior/límite superior+1")
	@Test
	void test17() {
		assertEquals(0,o.dividir(Integer.MAX_VALUE,Integer.MAX_VALUE+1));
	}
	
	@DisplayName ("Test de caja negra valor límite superior+1/límite superior+1")
	@Test
	void test18() {
		assertEquals(0,o.dividir(Integer.MAX_VALUE+1,Integer.MAX_VALUE+1));
	}

}
