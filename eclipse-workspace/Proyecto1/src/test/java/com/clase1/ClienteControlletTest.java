package com.clase1;

import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.proyecto1.controller.ClienteController;
import com.proyecto1.entity.Cliente;

public class ClienteControlletTest {

	private ClienteController clientecontroller;
	
	@Before
	public void setUp() {
		this.clientecontroller = new ClienteController();
	}
	
	@Test
	public void test() {
		Cliente cliente = this.clientecontroller.getById(5l);
		assertNotNull("Se esperaba encontrar un cliente", cliente);
		assertTrue("Nombre Incorrecto", cliente.getNombre().equals("Federico"));
		assertTrue("Apellido Incorrecto", cliente.getApellido().equals("Bustamante"));
		}

	public void testSave() {
		Cliente cliente = new Cliente(6l, "Juan", "Perez");
		this.clientecontroller.save(cliente);
		Cliente clienteResult = this.clientecontroller.getById(6l);
		assertNotNull("Se esperaba encontrar un cliente", cliente);
		assertTrue("Nombre Incorrecto", cliente.getNombre().equals("Juan"));
		assertTrue("Apellido Incorrecto", cliente.getApellido().equals("Perez"));
				
	}
	
}
