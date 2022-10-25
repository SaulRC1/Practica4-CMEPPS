package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practica4.cmepps.Cuenta;

class TestCuenta {

	private Cuenta cuenta;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {

		// Instanciamos una nueva cuenta
		cuenta = new Cuenta("12345", "Saúl Rodríguez Naranjo", 1000);

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {

		double saldoResultante = 1100;

		try {
			cuenta.ingresar(100);
			assertEquals(saldoResultante, cuenta.getSaldo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail();
		}

		

	}

	@Test
	void testRetirar() {

		double saldoResultante = 900;

		try {
			cuenta.retirar(100);
			assertEquals(saldoResultante, cuenta.getSaldo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail();
		}

		

	}

}
