package entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Ejercicios.Operaciones;

class PruebaListaString {

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
	void test1() {
		String [] array1 = {"AlvaroManso","LorenaMartinez","AntonioRojas"};
		String [] arrayEsperado = new String [] {"aro","ena","oni"} ;
		assertArrayEquals(arrayEsperado, o.listaString(array1));
	}
	
	@DisplayName ("Prueba de caja blanca errónea")
	@Test
	void test2() {
		String [] array1 = {"AlvaroManso","LorenaMartinez","AntonioRojas"};
		String [] arrayEsperado = new String [] {"AlvaroManso","LorenaMartinez","AntonioRojas"} ;
		assertNotEquals(arrayEsperado, o.listaString(array1));
	}

}
