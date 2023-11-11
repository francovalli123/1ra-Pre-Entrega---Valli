package com.example.preentrega.repository;

import com.example.preentrega.model.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoModel,Integer> {
}
