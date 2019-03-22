package entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Ejercicios.Operaciones;

class PruebaListaDouble {

	static Operaciones o = new Operaciones();
	static int operacionesRealizadas = 0;
	
	@AfterEach
	private void pruebasrealizadas() {
		operacionesRealizadas++;
		System.out.println(" Ejecutado test " + operacionesRealizadas);
	}
	
	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se han terminado de ejecutar todas las pruebas");
		o = new Operaciones();
	}
	
	@DisplayName ("Prueba de caja blanca")
	@Test
	void test() {
		double [] array1 = {1,2,3,4,5,6,7,8,9};
		double [] arrayEsperado = new double [] {1,6,27,12,125,18,343,24,729} ;
		assertArrayEquals(arrayEsperado, o.listaDoble(array1));
	}
	
	@DisplayName ("Prueba de caja blanca erróneo")
	@Test
	void test1() {
		double [] array1 = {1,2,3,4,5,6,7,8,9};
		double [] arrayEsperado = new double [] {34,54,32,33,4242,999,8213,21} ;
		assertNotEquals(arrayEsperado, o.listaDoble(array1));
	}

}
