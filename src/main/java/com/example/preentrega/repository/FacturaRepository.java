package com.example.preentrega.repository;

import com.example.preentrega.model.FacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<FacturaModel,Integer> {
}
