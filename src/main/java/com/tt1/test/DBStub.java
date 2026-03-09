package com.tt1.test;

import java.util.Collection;
import java.util.List;

public class DBStub{
	
	private List<ToDo> servicios;
	private Collection<String> correos;
	
	public boolean CREATE(ToDo servicio) {
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}
	
	public ToDo READ(String nombre) {
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}
	
	public boolean UPDATE(ToDo servicio) {
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}
	
	public void DELETE(ToDo servicio) {
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}
	
	public boolean agnadirCorreo(String correo) {
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}
	
	public String getCorreo(String correo) {
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}
	
	public boolean updateCorreo(String correoV,String correoN) {
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}
	
	public void deleteCorreo(String correo) {
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}
}
