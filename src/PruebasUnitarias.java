import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasUnitarias {
	
	Calculadora cal = new Calculadora();
	@Test
	@DisplayName("Prueba para capturar una excepcion Aritmetica")
	void pruebaException() {
		assertEquals(3,cal.divide(9,3));
		assertEquals(5,cal.divide(25,5));
		
		Exception e =assertThrows(ArithmeticException.class,
				()->cal.divide(10, 0) );
		assertEquals("/ by zero", e.getMessage());
	}
	
	@Test
	@DisplayName ("Prueba si getstring no es nulo")
	void pruebaString() {
		assertNotNull(cal.getStrPI());
	}
	
	@Test//si no tiene estro jamas se ejecutara la prueba
	@DisplayName ("Prueba el valor de PI dentro de un rango ")
	void pruebaBooleana(){
		assertTrue(cal.getPI()>=3.14);
		assertTrue(cal.getPI()<=3.1416);
	}//pruebaboleanas
	
	
	@Test//anotacion que indica el compilador que es prueba que tiene que hacer
	@DisplayName ("prueba la suma de dos enteros")//muestra titulos en las pruebas en consola, las anottaciones no llevan;
	void pruebaSumaEnteros() {
		assertEquals(4, cal.suma(2, 2));//assertEquals evalua si son iguales 
		assertEquals(6, cal.suma(3, 3));//
		assertEquals(18, cal.suma(9, 9));//
	}//prueba suma enteror s

}//pruebas unitarias
