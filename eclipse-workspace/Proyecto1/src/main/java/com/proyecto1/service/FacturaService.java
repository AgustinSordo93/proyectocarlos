package com.proyecto1.service;

import java.util.List;
import com.clase.exception.FacturaNotFoundException;
import com.proyecto1.entity.Factura;

public interface FacturaService {
	
	public List<Factura> getAll();
	public Factura getById(Long Id) throws FacturaNotFoundException;
	public Factura save(Factura Factura);
	public Factura delete(Long id) throws FacturaNotFoundException;
	

}