package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tt1.test.mock.ToDoMock;

class TestRepositorio {
	
	private Repositorio repo=new Repositorio();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBuscarServicio() {
		assertEquals(repo.buscarServicio("AYUDA"),ToDoMock.ejemplo.getNombre());
	}

	@Test
	void testCompletadoServicio() {
		assertTrue(repo.completadoServicio(ToDoMock.ejemplo));
	}

	@Test
	void testAgnadirServicio() {
		assertTrue(repo.agnadirServicio(ToDoMock.ejemplo));
	}

	@Test
	void testAgnadirCorreo() {
		assertTrue(repo.agnadirCorreo("ejemplo@unirioja.es"));
	}

}
