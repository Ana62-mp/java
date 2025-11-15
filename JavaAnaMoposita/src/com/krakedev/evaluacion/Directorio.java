package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	// CONSTRUCTOR
	public Directorio() {
		contactos = new ArrayList<Contacto>();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
	}

	// GET Y SET
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public boolean agregarContacto(Contacto contacto) {
		if (buscarPorCedula(contacto.getCedula()) == null) {
			contactos.add(contacto);
			fechaModificacion = new Date();
			return true;

		}
		return false;
	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto elmContacto;
		Contacto contactoEncontrado = null;
		for (int i = 0; i < contactos.size(); i++) {
			elmContacto = contactos.get(i);
			if (cedula.equals(elmContacto.getCedula())) {
				contactoEncontrado = elmContacto;
			}
		}

		return contactoEncontrado;
	}

	public String consultarUltimaModificacion() {
		String formato = "yyyy/MM/dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		String fechaFormateada = sdf.format(fechaModificacion);
		return fechaFormateada;
	}

	public int contarPerdidos() {
		Contacto elmContacto;
		int perdidos = 0;
		for (int i = 0; i < contactos.size(); i++) {
			elmContacto = contactos.get(i);
			if (elmContacto.getDireccion() == null) {
				perdidos += 1;
			}
		}
		return perdidos;
	}

	public int contarFijos() {
		int fijos = 0;
		for (Contacto contacto : contactos) {
			for (Telefono telefono : contacto.getTelefonos()) {
				if (telefono.getTipo().equalsIgnoreCase("convencional") && telefono.getEstado().equals("C")) {
					fijos++;
				}
			}
		}

		return fijos;
	}

	public void depurar() {
		for (Contacto contacto : contactos) {
			if (contacto.getDireccion() != null) {
				correctos.add(contacto);
			} else {
				incorrectos.add(contacto);
			}
		}
		
		contactos.clear();
		
	}

}
