package com.example.preentrega;

import com.example.preentrega.model.ClienteModel;
import com.example.preentrega.repository.ClienteRepository;
import com.example.preentrega.repository.DetallesFacturaRepository;
import com.example.preentrega.repository.FacturaRepository;
import com.example.preentrega.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PreentregaApplication implements CommandLineRunner {

	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	FacturaRepository facturaRepository;

	@Autowired
	ProductoRepository productoRepository;

	@Autowired
	DetallesFacturaRepository detallesFacturaRepository;

	public static void main(String[] args){

		SpringApplication.run(PreentregaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

	}
}
