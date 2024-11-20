package com.example.PruebaNttData.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Clase que representa un cliente. Contiene información personal básica como
 * nombres, apellidos, teléfono, dirección, y ciudad de residencia.
 */

@Data
public class Cliente {
	/** Primer nombre del cliente. */
	private String primerNombre;
	/** Segundo nombre del cliente. */
	private String segundoNombre;
	/** Primer apellido del cliente. */
	private String primerApellido;
	/** Segundo apellido del cliente. */
	private String segundoApellido;
	/** Número de teléfono del cliente. */
	private String telefono;
	/** Dirección de residencia del cliente. */

	/** Dirección de residencia del cliente. */
	private String direccion;

	/** Ciudad donde reside el cliente. */
	private String ciudadResidencia;

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}
	/** Constructor con todos sus argumentos */
	public Cliente(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String telefono, String direccion, String ciudadResidencia) {
		super();
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ciudadResidencia = ciudadResidencia;
	}

}
