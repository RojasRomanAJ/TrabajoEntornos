package entornos;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Ejercicios.Operaciones;

class PruebaAlumnos {

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
		String [][] array1 = {{"Alvaro","900","904"},{"Lorena","1000","960"},{"Antonio Jesus","930","1002"}};
		assertTrue(o.alumnosTrabajo(array1));
	}
	
	@DisplayName ("Prueba de caja blanca erróneo")
	@Test
	void test2() {
		String [][] array1 = {{"Alvaro","200","203"},{"Lorena","300"},{"Antonio Jesus","230","302"}};
		assertFalse(o.alumnosTrabajo(array1));
	}

}
