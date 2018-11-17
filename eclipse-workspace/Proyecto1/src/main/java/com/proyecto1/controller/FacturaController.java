package com.proyecto1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.clase.exception.FacturaNotFoundException;
import com.proyecto1.entity.Factura;
import com.proyecto1.service.FacturaService;
import com.proyecto1.types.GenericMessage;


@RestController
@RequestMapping("/facturas")
public class FacturaController {
	
	@Autowired
	private FacturaService facturaService;
	
	@GetMapping
	public List<Factura> getAll() {
		return this.facturaService.getAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable("id")long id) {
		ResponseEntity<?> response =null;
		try {
			Factura factura = this.facturaService.getById(id);
			response = ResponseEntity.status(HttpStatus.OK).body(factura);
		}catch (FacturaNotFoundException cnfe) {
			response = ResponseEntity.status(HttpStatus.NOT_FOUND).body(new GenericMessage(404, "Factura"));
		}catch (Exception e)	{
			response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}		
			
		return response;
	}
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Factura factura) {
		
		ResponseEntity<?> response =null;
	
		try {
			Factura result = this.facturaService.save(factura);
			response = ResponseEntity.status(HttpStatus.OK).body(result);
		}	catch(Exception e){
			response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());

		}
		return response;
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id")Long id){
	
	ResponseEntity<?> response =null;
	
	try {
		Factura result = this.facturaService.delete(id);
		response = ResponseEntity.status(HttpStatus.OK).body(result);
	}	catch(Exception e){
		response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());

	}
	return response;
	
}
	

}
