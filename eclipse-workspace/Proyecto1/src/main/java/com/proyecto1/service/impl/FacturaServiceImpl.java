package com.proyecto1.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clase.exception.FacturaNotFoundException;
import com.proyecto1.entity.Factura;
import com.proyecto1.repository.FacturaRepository;
import com.proyecto1.service.FacturaService;

@Service
public class FacturaServiceImpl implements FacturaService{
	
	@Autowired
	private FacturaRepository facturaRepository;
	
	@Override
	public List<Factura> getAll() {
		
		return this.facturaRepository.findAll();
	}
	
	@Override
	public Factura getById(Long id) throws FacturaNotFoundException {
		Factura factura = null;
		Optional<Factura> result =  this.facturaRepository.findById(id);
		if(result.isPresent()) {
			factura = result.get();
		}
		return factura;
		}
	
	@Override
	public Factura save(Factura factura) {
		return this.facturaRepository.save(factura);
	}
	
	@Override
	public Factura delete(Long id) throws FacturaNotFoundException{
		Factura factura = this.getById(id);
		this.facturaRepository.delete(factura);
		return factura;
		
	}
	
}
