package com.proyecto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyecto1.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{

	
	
}
