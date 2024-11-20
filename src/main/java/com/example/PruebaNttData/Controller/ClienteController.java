package com.example.PruebaNttData.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.PruebaNttData.Models.Cliente;
import com.example.PruebaNttData.Service.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	private final ClienteService clienteService;

	/**
	 * Constructor del controlador que inyecta el servicio de cliente.
	 *
	 * @param clienteService Servicio utilizado para manejar la lógica de negocio de
	 *                       los clientes.
	 */

	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	/**
	 * Endpoint para obtener información de un cliente basado en su tipo y número de
	 * documento.
	 *
	 * @param tipoDocumento   Tipo de documento del cliente (C: Cédula, P:
	 *                        Pasaporte).
	 * @param numeroDocumento Número del documento del cliente.
	 * @return La información del cliente como un objeto JSON.
	 */

	@GetMapping(value = "/clientes", produces = "application/json")
	public ResponseEntity<Cliente> obtenerCliente(@RequestParam String tipoDocumento,
			@RequestParam String numeroDocumento) {
		Cliente cliente = clienteService.obtenerCliente(tipoDocumento, numeroDocumento);
		return ResponseEntity.ok(cliente);
	}
}
