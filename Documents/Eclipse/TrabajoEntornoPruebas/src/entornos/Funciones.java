package entornos;

public class Funciones {

	public Funciones() {
		
		
	}
	
	/* Funcion que comprueba si un numero entero es divisible entre X */
	
	public boolean divisible(int num1) {
		return num1%23==0;
	}
	
	/* Funcion que comprueba si un numero existen en el intervalo Y -50 
	 * e Y + 50 */
	
	public boolean intervalo(int num1) {
		if((num1 > 600)&&(num1 < 700)) {
			return true;
		}
			return false;
	}
	
	/* Funcion que divida un numero que sea divisible entre X, entre un numero
	 * que este entre el intervalo Y - 50 e Y + 50. Si los numero no son divisibles
	 * debe devolver 0 la funcion */
	
	public int division(int num1, int num2) {
		
			if (num1 %23 == 0) {
				if ((num2 > 600)&&(num2 < 700)) {
					return num1/num2;
				}
				
			}
	return 0;	
	}
	
	/* Funcion que dada tres cadenas, devuelva las tres cadenas concatenadas pero que
	 * elimine las vocales y mayusculas. Este ejercicio debe incluirse una prueba con los
	 * nombres de los integrantes del grupo y la fecha de nacimiento de los integrantes
	 * del grupo */
	
	public String eliminaVocalesMayusculas(String cad1, String cad2, String cad3) {
		
		String letras ="qwrtypñlkjhgfdszxcvbnm";
		String pos = cad1 +cad2+cad3;
		
		for(int i=0;i<pos.length();i++) {
			for(int j=0;j<letras.length();j++) {
				if(pos.charAt(i)==letras.charAt(j)) {
					pos+=pos.charAt(i);
				}
			}
		}	
	return pos;	
	}
	
	/* Funcion que dada una cadena, obtenga todos los numeros de dicha cadena y los sume
	 * Este ejercicio debe incluirse una prueba con los nombres de los integrantes del grupo
	 *  y la fecha de nacimiento de cada uno de ellos */
	
	public int nombreynacimiento(String cad1) {
		
		String numeros ="1234567890";
		int total=0;
		
		for(int i=0;i<cad1.length();i++) {
			for(int j=0;j<numeros.length();j++) {
				if(cad1.charAt(i)==numeros.charAt(j)) {
					total+=cad1.charAt(i)-48;
				}
			}
		}
		return total;
	}
	
	/* Funcion que dada una lista de double, devuelva una lista con todos los numeros en posicion
	 * par multiplicados por Z, y los de la posicion impar multiplicados W veces por si mismo */
	
	public double[] listaDoble(double array[]) {
		for(int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = array[i] * 8;
			} else {
				array[i] = array[i] * array[i] * array[i];
			}
		}
		return array;
	}
	
	/* Funcion que dada una lista de Strings, devuelva los Strings pero recortado a partir de R caracteres
	 * y hasta 5 caracteres */
	
	public String[] listaString(String array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i].substring(8, 5);
		}
		return array;
	}
	
	/* Funcion que dado una lista de alumnos y una lista de trabajos con el tiempo empleado en cada
	 * uno en minutos, devuelva verdadero si el tiempo total empleado en todos los trabajos por cada
	 * alummno es mayor a T minutos */
	
	public Boolean alumnosTrabajo(String[][] array) {
		boolean verdadero = true;
		
		for(int i = 0; i < array.length; i++) {
			int total = 0;
			for(int j = 1; j < array[i].length; j++) {
				int num1 = Integer.parseInt(array[i][j]);
				total = total + num1;
			}
			if(total<=900) {
				verdadero = false;
			}
		}
		return verdadero;
	}
	
}
