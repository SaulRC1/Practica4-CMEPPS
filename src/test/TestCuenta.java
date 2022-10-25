package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Level;
import java.util.logging.Logger;

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
	
	@Test
	void test0014() {
		
		Cuenta cuentaTest1 = new Cuenta("12345", "Test 1", 50);
		Cuenta cuentaTest2 = new Cuenta("67890", "Test 2", 0);
		
		try {
			
			cuentaTest1.retirar(200);
			
			cuentaTest2.retirar(350);
			
			cuentaTest1.ingresar(100);
			
			try {
				
				cuentaTest2.retirar(200);
				
			} catch(Exception e) {
				Logger.getLogger(TestCuenta.class.getName())
				.log(Level.SEVERE, e.getMessage(), e.getStackTrace());
			}
			
			cuentaTest2.retirar(150);
			
			cuentaTest1.retirar(200);
			
			cuentaTest2.ingresar(50);
			
			try {
				
				cuentaTest2.retirar(100);
				
			} catch(Exception e) {
				Logger.getLogger(TestCuenta.class.getName())
				.log(Level.SEVERE, e.getMessage(), e.getStackTrace());
			}
			
			assertEquals(-250, cuentaTest1.getSaldo());
			
			assertEquals(-450, cuentaTest2.getSaldo());
			
			
		} catch(Exception e) {
			
			fail();
			
		}
		
		
	}

}
