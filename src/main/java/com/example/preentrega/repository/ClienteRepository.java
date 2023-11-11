package com.example.preentrega.repository;

import com.example.preentrega.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel,Integer> {
}
