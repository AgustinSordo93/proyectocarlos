package com.proyecto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyecto1.entity.Factura;

@Repository
public interface FacturaRepository  extends JpaRepository<Factura, Long>{

}
