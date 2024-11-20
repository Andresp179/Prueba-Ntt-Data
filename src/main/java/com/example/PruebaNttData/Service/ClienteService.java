package com.example.PruebaNttData.Service;

import org.springframework.stereotype.Service;

import com.example.PruebaNttData.Exception.InvalidInputException;
import com.example.PruebaNttData.Models.Cliente;

/**
 * Servicio para manejar la lógica de negocio relacionada con los clientes.
 */
@Service
public class ClienteService {

	/**
	 * Método para obtener la información de un cliente basado en su tipo y número
	 * de documento.
	 * 
	 * @param tipoDocumento   Tipo de documento del cliente (C: Cédula, P:
	 *                        Pasaporte).
	 * @param numeroDocumento Número del documento del cliente.
	 * @return Un objeto Cliente con la información del cliente.
	 * @throws InvalidInputException Si el tipo de documento no es válido.
	 */
	public Cliente obtenerCliente(String tipoDocumento, String numeroDocumento) {
		if (!tipoDocumento.equals("C") && !tipoDocumento.equals("P")) {
			throw new InvalidInputException("Tipo de documento no válido. Solo se permite 'C' o 'P'.");
		}
		// Retornar datos "quemados"
		return new Cliente("José", "Luis", "Pérez", "González", "123456789", "Calle Falsa 123", "Bogotá");
	}

}
